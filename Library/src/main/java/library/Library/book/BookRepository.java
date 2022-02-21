package library.Library.book;

import java.util.Set;

public interface BookRepository {
    void insertBook(Book book);
    void deleteBook(String title);
    Book findByTitle(String title);
    Set<String> getAllBookTitle();
}
