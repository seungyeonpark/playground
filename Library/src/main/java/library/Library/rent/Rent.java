package library.Library.rent;

import library.Library.book.Book;

public class Rent {

    private Long memberId;
    private Book book;
    private int period;

    public Rent(Long memberId, Book book, int period) {
        this.memberId = memberId;
        this.book = book;
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "memberId=" + memberId +
                ", book=" + book +
                ", period=" + period +
                '}';
    }
}
