package z2Test;

import org.example.z2.Book;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testBookConstructor() {
        Book book = new Book("Java Programming", "John Doe", 2021);
        assertEquals("Java Programming", book.title);
        assertEquals("John Doe", book.author);
        assertEquals(2021, book.year);
    }
}
