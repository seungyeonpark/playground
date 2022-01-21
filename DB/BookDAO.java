package project;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
    private Connection con;
    private Statement st;
    private ResultSet rs;
	
    public void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "password");
            st = con.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    public void insertBook(BookDTO bookDTO) {
        StringBuilder SQL = new StringBuilder("INSERT INTO book VALUES('");
        SQL.append(bookDTO.getBookNo() + "', '");
        SQL.append(bookDTO.getBookTitle() + "', '");
        SQL.append(bookDTO.getBookAuthor() + "', ");
        SQL.append(bookDTO.getBookYear() + ", ");
        SQL.append(bookDTO.getBookPrice() + ", '");
        SQL.append(bookDTO.getBookPublisher() + "');");
		
        try {
            st.executeUpdate(SQL.toString());
        } catch (SQLException e) {
            System.out.println("Error while inserting data: " + e.getMessage());
        }
    }
	
    public void selectBook() {
        String SQL = "SELECT * FROM book";
        try {
            rs = st.executeQuery(SQL);
            while (rs.next()) {
                String result = String.format("%s\t%s\t%s\t%s\t%s\t%s\t", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                System.out.println(result);
            }
        } catch (SQLException e) {
            System.out.println("Error while printing data: " + e.getMessage());
        }
    }
	
    public void closeDB() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("Error while closing ResultSet: " + e.getMessage());
            }
        }
		
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                System.out.println("Error while closing Statement: " + e.getMessage());
            }
        }
		
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error while closing Connection: " + e.getMessage());
            }
        }
    }
}
