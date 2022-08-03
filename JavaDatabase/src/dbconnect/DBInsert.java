package dbconnect;

import java.sql.*;

public class DBInsert {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/bookstore";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        String sql = "select * from book";
        String insertSql = "INSERT INTO book (title,page_number,author_id) VALUES ('Java',800,2)";
        String prSql = "INSERT INTO book (title,page_number,author_id) VALUES (?,?,?)";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);


            //st = connect.createStatement();
            //System.out.println(st.executeUpdate(insertSql));


            PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setString(1,"Patika");
            prSt.setInt(2,500);
            prSt.setInt(3,5);

            prSt.executeUpdate();

            connect.close();
            prSt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
