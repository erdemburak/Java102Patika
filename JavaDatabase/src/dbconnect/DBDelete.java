package dbconnect;

import java.sql.*;

public class DBDelete {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/bookstore";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        String sql = "select * from book";
        String stSql = "DELETE FROM book WHERE id=31";
        String prSql = "DELETE FROM book WHERE id= ?";
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            st = connect.createStatement();
            st.executeUpdate(stSql);

            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,32);

            st.close();
            pr.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
