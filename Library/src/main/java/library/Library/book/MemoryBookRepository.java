package library.Library.book;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class MemoryBookRepository implements BookRepository{

    private static Map<String, Book> store = new HashMap<>();

    @Override
    public void insertBook(Book book) {
        store.put(book.getTitle(), book);
    }

    @Override
    public void deleteBook(String title) {
        store.remove(title);
    }

    @Override
    public Book findByTitle(String title) {
        return store.get(title);
    }

    @Override
    public Set<String> getAllBookTitle() {
        return store.keySet();
    }
}
