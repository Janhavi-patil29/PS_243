import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yourpackage.aqualens.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            performLogin()
        }
    }

    private fun performLogin() {
        val employeeId = binding.etEmployeeId.text.toString()
        val password = binding.etPassword.text.toString()

        // Basic validation
        if (employeeId.isNotEmpty() && password.isNotEmpty()) {
            // NOTE: In a real app, you would authenticate against a server here.
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            
            // Navigate to Home Activity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Prevents user from going back to login screen
        } else {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
        }
    }
}