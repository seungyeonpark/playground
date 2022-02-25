package library.Library.rent;

import library.Library.book.Book;
import library.Library.book.BookRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentRentService implements RentService{

    private final BookRepositoryService bookRepositoryService;
    private final static int period = 3;

    @Override
    public Rent rentBook(Long memberId, String title) {
        Book book = bookRepositoryService.findBook(title);
        return new Rent(memberId, book, period);
    }
}
