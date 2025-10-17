// ReadingDao.kt - Data Access Object
@Dao
interface ReadingDao {
    @Insert
    suspend fun insertReading(reading: Reading)

    @Query("SELECT * FROM readings ORDER BY timestamp DESC")
    fun getAllReadings(): LiveData<List<Reading>>
}
