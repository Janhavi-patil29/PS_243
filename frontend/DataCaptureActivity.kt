class DataCaptureActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataCaptureBinding
    private var imageCapture: ImageCapture? = null
    private lateinit var database: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataCaptureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // Initialize Room Database
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "aqualens-db"
        ).build()

        startCamera()

        binding.btnCapture.setOnClickListener { takePhoto() }
        binding.btnConfirm.setOnClickListener { saveReading() }
    }

    private fun takePhoto() {
        val imageCapture = imageCapture ?: return
        
        // Define where to save the image
        val photoFile = File(externalMediaDirs.firstOrNull(), "${System.currentTimeMillis()}.jpg")
        val outputOptions = ImageCapture.OutputFileOptions.Builder(photoFile).build()

        imageCapture.takePicture(
            outputOptions, ContextCompat.getMainExecutor(this),
            object : ImageCapture.OnImageSavedCallback {
                override fun onImageSaved(output: ImageCapture.OutputFileResults) {
                    // Photo saved, now process it
                    processImageWithAI(photoFile.absolutePath)
                }
                override fun onError(exc: ImageCaptureException) {
                    Toast.makeText(baseContext, "Photo capture failed.", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    private fun processImageWithAI(imagePath: String) {
        // NOTE: This is where your TensorFlow Lite model would run on the image.
        // We will simulate a result.
        val aiResult = 15.7
        binding.etWaterLevel.setText(aiResult.toString())
        binding.etWaterLevel.isEnabled = true // Allow manual correction
        
        binding.btnCapture.visibility = View.GONE
        binding.btnConfirm.visibility = View.VISIBLE
    }

    private fun saveReading() {
        val readingValue = binding.etWaterLevel.text.toString().toDoubleOrNull() ?: return
        
        val newReading = Reading(
            waterLevel = readingValue,
            timestamp = System.currentTimeMillis(),
            latitude = 0.0, // Get actual location
            longitude = 0.0, // Get actual location
            imagePath = "path/to/image" // Store the actual path from takePhoto()
        )

        // Save to Room DB in a background thread
        lifecycleScope.launch(Dispatchers.IO) {
            database.readingDao().insertReading(newReading)
            withContext(Dispatchers.Main) {
                Toast.makeText(this@DataCaptureActivity, "Reading Saved Locally!", Toast.LENGTH_LONG).show()
                finish() // Go back to home screen
            }
        }
    }
    
    // Boilerplate code to start camera preview omitted for brevity...
    private fun startCamera() { /* ... */ }
}