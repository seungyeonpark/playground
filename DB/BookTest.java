package project;

public class BookTest {

    public static void main(String[] args) {
        BookDTO book = new BookDTO("B004", "자바스크립트", "강길동", 2020, 28000, "서울출판사");
		
        BookDAO bookDAO = new BookDAO();
		
        bookDAO.connectDB();
		
        bookDAO.insertBook(book);
        bookDAO.selectBook();
		
        bookDAO.closeDB();
    }
}
