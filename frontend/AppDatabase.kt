// AppDatabase.kt - The Database
@Database(entities = [Reading::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun readingDao(): ReadingDao
}