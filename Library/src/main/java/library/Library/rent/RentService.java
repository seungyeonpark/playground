package library.Library.rent;

public interface RentService {
    Rent rentBook(Long memberId, String title);
}
