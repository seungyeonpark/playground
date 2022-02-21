package library.Library.book;

public class Book {
    private final int code;
    private final String title;
    private final String author;

    public Book(int code, String title, String author) {
        this.code = code;
        this.title = title;
        this.author = author;
    }

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
