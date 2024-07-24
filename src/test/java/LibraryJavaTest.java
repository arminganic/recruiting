import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import data.BooksKt;
import java.util.List;
import models.Book;
import org.junit.jupiter.api.Test;
import services.LibraryService;

class LibraryJavaTest {

  private final LibraryService library = null;

  @Test
  void shouldGetAllBooks() {
    if (library == null) {
      fail();
      return;
    }
    List<Book> result = library.getBooks();
    List<Book> books = BooksKt.getBooks();
    assertEquals(5, result.size());
    assertSame(result.get(0), books.get(0));
    assertSame(result.get(1), books.get(1));
    assertSame(result.get(2), books.get(2));
    assertSame(result.get(3), books.get(3));
    assertSame(result.get(4), books.get(4));
  }

  @Test
  void shouldGetAvailableBooks() {
    if (library == null) {
      fail();
      return;
    }
    List<Book> result = library.getAvailableBooks();
    List<Book> books = BooksKt.getBooks();
    assertEquals(2, result.size());
    assertSame(result.get(0), books.get(1));
    assertSame(result.get(1), books.get(4));
  }

  @Test
  void shouldGetBooksByTitle() {
    if (library == null) {
      fail();
      return;
    }
    List<Book> result = library.getBooksByTitle("The");
    List<Book> books = BooksKt.getBooks();
    assertEquals(3, result.size());
    assertSame(result.get(0), books.get(2));
    assertSame(result.get(1), books.get(3));
    assertSame(result.get(2), books.get(4));
  }

  @Test
  void shouldGetAvailableBooksByTitle() {
    if (library == null) {
      fail();
      return;
    }
    List<Book> result = library.getBooksByTitle("The");
    List<Book> books = BooksKt.getBooks();
    assertEquals(1, result.size());
    assertSame(result.get(0), books.get(4));
  }

  @Test
  void shouldGetLentBooksByCustomer() {
    if (library == null) {
      fail();
      return;
    }
    List<Book> result = library.getBooksByTitle("The");
    List<Book> books = BooksKt.getBooks();
    assertEquals(2, result.size());
    assertSame(result.get(0), books.get(0));
    assertSame(result.get(1), books.get(2));
  }

  @Test
  void shouldGetOverdueBooks() {
    if (library == null) {
      fail();
      return;
    }
    List<Book> result = library.getBooksByTitle("The");
    List<Book> books = BooksKt.getBooks();
    assertEquals(2, result.size());
    assertSame(result.get(0), books.get(2));
    assertSame(result.get(1), books.get(3));
  }
}
