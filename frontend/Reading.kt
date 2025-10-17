// Reading.kt - The data entity
@Entity(tableName = "readings")
data class Reading(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val waterLevel: Double,
    val timestamp: Long,
    val latitude: Double,
    val longitude: Double,
    val imagePath: String,
    val isSynced: Boolean = false
)