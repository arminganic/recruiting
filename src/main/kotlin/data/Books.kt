package data

import models.Book
import java.time.LocalDate

val books = listOf(
    Book(
        title = "Do Androids Dream of Electric Sheep?",
        lendTo = customers[3],
        lendAt = LocalDate.now().minusWeeks(1)
    ),
    Book(
        title = "Everything I Never Told You",
        lendTo = null,
        lendAt = null
    ),
    Book(
        title = "Are you there, Vodka? It's Me, Chelsea",
        lendTo = customers[3],
        lendAt = LocalDate.now().minusWeeks(5),
    ),
    Book(
        title = "The Devil Wears Prada",
        lendTo = customers[2],
        lendAt = LocalDate.now().minusWeeks(10),
    ),
    Book(
        title = "The Curious Incident of the Dog in the Night-Time",
        lendTo = null,
        lendAt = null,
    ),
)
