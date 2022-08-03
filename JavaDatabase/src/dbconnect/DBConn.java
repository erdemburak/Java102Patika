package dbconnect;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/bookstore";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        String sql = "select * from book";
        String insertSql = "INSERT INTO book (title,page_number,author_id) VALUES ('Java',800,2)";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);

            data.next();// Sonraki dataya geçer
            data.next();
            data.first(); // ilk dataya geçer
            data.absolute(2); // verilen row değeri kadar ilerler
            System.out.println(data.getString("title"));

            st.executeUpdate(insertSql);

            while (data.next()){
                System.out.println("ID : " + data.getInt("id") + "\t\tPage Number : " + data.getInt("page_number")+ "\t\tBook Title : " + data.getString("title") );
            }
            st.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
