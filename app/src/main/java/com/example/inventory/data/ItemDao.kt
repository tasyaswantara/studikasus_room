import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.inventory.data.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    // Fungsi untuk menambahkan item, jika ada konflik akan diabaikan
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    // Fungsi untuk memperbarui item yang sudah ada
    @Update
    suspend fun update(item: Item)

    // Fungsi untuk menghapus item dari database
    @Delete
    suspend fun delete(item: Item)

    // Query untuk mengambil item berdasarkan id dengan output tipe Flow
    @Query("SELECT * from items WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    // Query untuk mengambil semua item, diurutkan berdasarkan nama secara ascending
    @Query("SELECT * from items ORDER BY name ASC")
    fun getAllItems(): Flow<List<Item>>
}