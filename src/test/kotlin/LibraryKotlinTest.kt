import data.books
import data.customers
import org.junit.jupiter.api.Test
import services.LibraryService
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LibraryKotlinTest {
    private val library: LibraryService? = null

    @Test
    fun shouldGetAllBooks() {
        if (library == null) {
            assertTrue(false)
            return
        }
        val result = library.getBooks()
        assertEquals(5, result.size)
        assertContains(result, books[0])
        assertContains(result, books[1])
        assertContains(result, books[2])
        assertContains(result, books[3])
        assertContains(result, books[4])
    }

    @Test
    fun shouldGetAvailableBooks() {
        if (library == null) {
            assertTrue(false)
            return
        }
        val result = library.getAvailableBooks()
        assertEquals(2, result.size)
        assertContains(result, books[1])
        assertContains(result, books[4])
    }

    @Test
    fun shouldGetBooksByTitle() {
        if (library == null) {
            assertTrue(false)
            return
        }
        val result = library.getBooksByTitle("The")
        assertEquals(3, result.size)
        assertContains(result, books[2])
        assertContains(result, books[3])
        assertContains(result, books[4])
    }

    @Test
    fun shouldGetAvailableBooksByTitle() {
        if (library == null) {
            assertTrue(false)
            return
        }
        val result = library.getAvailableBooksByTitle("The")
        assertEquals(1, result.size)
        assertContains(result, books[4])
    }

    @Test
    fun shouldGetLentBooksByCustomer() {
        if (library == null) {
            assertTrue(false)
            return
        }
        val result = library.getLentBooksByCustomer(customers[3])
        assertEquals(2, result.size)
        assertContains(result, books[0])
        assertContains(result, books[2])
    }

    @Test
    fun shouldGetOverdueBooks() {
        if (library == null) {
            assertTrue(false)
            return
        }
        val result = library.getOverdueBooks()
        assertEquals(2, result.size)
        assertContains(result, books[2])
        assertContains(result, books[3])
    }
}
