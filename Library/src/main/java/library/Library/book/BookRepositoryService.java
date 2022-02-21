package library.Library.book;

public interface BookRepositoryService {

    void insertBook(Book book);
    void deleteBook(String title);
    Book findBook(String title);
    void printAllBooks();
}
