import { Book } from '../models/book.model'
import { Customer } from '../models/customer.model'

export interface LibraryService {
  readonly maxLendingPeriodInWeeks: number

  getBooks(): Book[]

  getAvailableBooks(): Book[]

  getBooksByTitle(title: string): Book[]

  getAvailableBooksByTitle(title: string): Book[]

  getLentBooksByCustomer(customer: Customer): Book[]

  getOverdueBooks(): Book[]
}

export const libraryService = {} as LibraryService
