
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SI2026Lab2Test {

    @Test
    public void searchBookEveryStatementTest() {
        Library library = new Library();
        library.addBook(new Book("Effective Java", "Joshua Bloch", "Programming"));
        library.addBook(new Book("1984", "George Orwell", "Dystopian"));

        assertThrows(IllegalArgumentException.class, () -> library.searchBookByTitle(""));

        List<Book> results = library.searchBookByTitle("Effective Java");
        assertEquals(1, results.size());

        List<Book> noResults = library.searchBookByTitle("Clean Code");
        assertEquals(null, noResults);
    }


    @Test
    public void borrowBookEveryBranchTest() {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin", "Programming"));

        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("", ""));

        library.borrowBook("Clean Code", "Robert C. Martin");
        assertEquals(0, library.countAvailableBooks());
        assertThrows(RuntimeException.class, () -> library.borrowBook("Clean Code", "Robert C. Martin"));

        assertThrows(RuntimeException.class, () -> library.borrowBook("random", "random"));
    }

    @Test
    public void searchBookMultipleConditionTest() {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin", "Programming"));

        assertNotNull(library.searchBookByTitle("Clean Code"));

        library.borrowBook("Clean Code", "Robert C. Martin");
        assertNull(library.searchBookByTitle("Clean Code"));

        assertNull(library.searchBookByTitle("Unknown"));
    }


    @Test
    public void borrowBookMultipleConditionTest() {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin", "Programming"));

        assertThrows(IllegalArgumentException.class,
                () -> library.borrowBook("", ""));

        assertThrows(IllegalArgumentException.class,
                () -> library.borrowBook("Title", ""));

        library.borrowBook("Clean Code", "Robert C. Martin");

        assertEquals(0, library.countAvailableBooks());

    }
}