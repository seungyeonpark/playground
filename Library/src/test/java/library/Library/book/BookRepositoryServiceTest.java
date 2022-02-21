package library.Library.book;

import library.Library.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class BookRepositoryServiceTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void insertBookTest() {
        Book newBook = new Book(1, "book1", "author1");
        BookRepositoryService bookRepositoryService = ac.getBean(BookRepositoryService.class);
        bookRepositoryService.insertBook(newBook);

        Book findBook = bookRepositoryService.findBook("book1");

        assertThat(newBook).isSameAs(findBook);
    }

    @Test
    void deleteBookTest() {
        Book newBook2 = new Book(2, "book2", "author2");
        BookRepositoryService bookRepositoryService = ac.getBean(BookRepositoryService.class);
        bookRepositoryService.insertBook(newBook2);

        bookRepositoryService.deleteBook("book2");

        assertThat(bookRepositoryService.findBook("book2")).isSameAs(null);
    }
}
