package library.Library.rent;

import library.Library.AppConfig;
import library.Library.book.Book;
import library.Library.book.BookRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ProfessorRentServiceTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    void rentBook() {
        Book book = new Book(1, "book1", "author1");
        BookRepository bookRepository = ac.getBean(BookRepository.class);
        bookRepository.insertBook(book);

        Map<String, RentService> beansOfType = ac.getBeansOfType(RentService.class);

        RentService studentRentService = beansOfType.get("professorRentService");

        Rent book1 = studentRentService.rentBook(1L, "book1");
        Assertions.assertThat(book1.getPeriod()).isEqualTo(9);
    }
}
