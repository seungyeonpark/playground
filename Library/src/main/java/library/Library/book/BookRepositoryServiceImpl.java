package library.Library.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class BookRepositoryServiceImpl implements BookRepositoryService{

    private final BookRepository bookRepository;

    @Override
    public void insertBook(Book book) {
        bookRepository.insertBook(book);
    }

    @Override
    public void deleteBook(String title) {
        bookRepository.deleteBook(title);
    }

    @Override
    public Book findBook(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public void printAllBooks() {
        Set<String> bookTitle = bookRepository.getAllBookTitle();
        for (String key : bookTitle) {
            System.out.println(findBook(key));
        }
    }
}
