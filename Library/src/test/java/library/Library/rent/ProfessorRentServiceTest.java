package library.Library.rent;

import library.Library.ProfessorAppConfig;
import library.Library.book.Book;
import library.Library.book.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfessorRentServiceTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(ProfessorAppConfig.class);

    @Test
    void rentBook() {
        Book book = new Book(1, "book1", "author1");
        BookRepository bookRepository = ac.getBean(BookRepository.class);
        bookRepository.insertBook(book);

        RentService rentService = ac.getBean(RentService.class);
        Rent rent = rentService.rentBook(1L, "book1");

        assertThat(rent.getPeriod()).isEqualTo(9);
    }
}
