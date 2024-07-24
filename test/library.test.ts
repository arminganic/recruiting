import { books } from '../src/data/books.data'
import { customers } from '../src/data/customers.data'
import { libraryService } from '../src/services/library.service'

describe('Library', () => {
  test('should get all books', () => {
    const result = libraryService.getBooks()
    expect(result).toHaveLength(5)
    expect(result).toContain(books[0])
    expect(result).toContain(books[1])
    expect(result).toContain(books[2])
    expect(result).toContain(books[3])
    expect(result).toContain(books[4])
  })

  test('should get books by title', () => {
    const result = libraryService.getBooksByTitle('The')
    expect(result).toHaveLength(3)
    expect(result).toContain(books[2])
    expect(result).toContain(books[3])
    expect(result).toContain(books[4])
  })

  test('should get available books by title', () => {
    const result = libraryService.getAvailableBooksByTitle('The')
    expect(result).toHaveLength(1)
    expect(result).toContain(books[4])
  })

  test('should get lent books by customer', () => {
    const result = libraryService.getLentBooksByCustomer(customers[3])
    expect(result).toHaveLength(2)
    expect(result).toContain(books[0])
    expect(result).toContain(books[2])
  })

  test('should get overdue books', () => {
    const result = libraryService.getOverdueBooks()
    expect(result).toHaveLength(2)
    expect(result).toContain(books[2])
    expect(result).toContain(books[3])
  })
})
