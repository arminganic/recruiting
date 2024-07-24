package models

class Book {
    val title: Any
    val lendTo: Any?
    val lendAt: Any?

    constructor(title: Any, lendTo: Any?, lendAt: Any?) {
        this.title = title
        this.lendTo = lendTo
        this.lendAt = lendAt
    }
}
