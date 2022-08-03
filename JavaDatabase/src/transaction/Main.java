package transaction;

import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/bookstore";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connect.setAutoCommit(false);
            PreparedStatement prSt = connect.prepareStatement("INSERT INTO book (title,page_number,author_id) VALUES (?,?,?)");
            prSt.setString(1,"JAVA");
            prSt.setInt(2,340);
            prSt.setInt(3,12);
            prSt.executeUpdate();

            if (true){
                throw new SQLException();
            }

            prSt.setString(1,"Algoritma");
            prSt.setInt(2,300);
            prSt.setInt(3,22);
            prSt.executeUpdate();

            connect.commit();
            connect.close();
            prSt.close();
        } catch (SQLException e) {
            if(connect != null){
                try {
                    connect.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println(e.getMessage());
        }
    }
}
