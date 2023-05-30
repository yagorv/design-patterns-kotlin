package adapter.examples.books

import org.junit.Assert.assertEquals
import org.junit.Test

class AdapterBookTest {

    @Test
    fun testTitleAndAuthor() {
        val simpleBook = SimpleBook("The Great Gatsby", "F. Scott Fitzgerald")
        val adapterBook = AdapterBook(simpleBook)

        val expectedTitleAndAuthor = "The Great Gatsby .by F. Scott Fitzgerald"
        val actualTitleAndAuthor = adapterBook.titleAndAuthor

        assertEquals(expectedTitleAndAuthor, actualTitleAndAuthor)
    }

}
