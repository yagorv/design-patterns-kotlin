package adapter.examples.books

class AdapterBook(private val book: SimpleBook) : Book {
    override val titleAndAuthor: String
        get() = book.title + " .by " + book.author
}