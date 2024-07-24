package services

import models.Book
import models.Customer

interface LibraryService {
    val maxLendingPeriodInWeeks: Int

    fun getBooks(): List<Book>

    fun getAvailableBooks(): List<Book>

    fun getBooksByTitle(title: String): List<Book>

    fun getAvailableBooksByTitle(title: String): List<Book>

    fun getLentBooksByCustomer(customer: Customer): List<Book>

    fun getOverdueBooks(): List<Book>
}
