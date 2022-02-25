package library.Library.rent;

import library.Library.AppConfig;
import library.Library.book.Book;
import library.Library.book.BookRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class RentServiceTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class, RentPolicy.class);

    @Test
    void studentRentTest() {
        RentPolicy rentPolicy = ac.getBean(RentPolicy.class);
        RentService studentRentService = rentPolicy.getRentService("studentRentService");

        Book book = new Book(1, "book1", "author1");
        BookRepository bookRepository = ac.getBean(BookRepository.class);
        bookRepository.insertBook(book);

        Rent rent = studentRentService.rentBook(1L, "book1");

        Assertions.assertThat(rent.getPeriod()).isEqualTo(3);
    }

    @Test
    void professorRentTest() {
        RentPolicy rentPolicy = ac.getBean(RentPolicy.class);
        RentService professorRentService = rentPolicy.getRentService("professorRentService");

        Book book = new Book(1, "book1", "author1");
        BookRepository bookRepository = ac.getBean(BookRepository.class);
        bookRepository.insertBook(book);

        Rent rent = professorRentService.rentBook(1L, "book1");

        Assertions.assertThat(rent.getPeriod()).isEqualTo(9);
    }

    static class RentPolicy {
        private final Map<String, RentService> rentService;

        @Autowired
        RentPolicy(Map<String, RentService> rentService) {
            this.rentService = rentService;
        }

        public RentService getRentService(String rentServiceName) {
            return rentService.get(rentServiceName);
        }
    }
}
