package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {
        /**
         * Database bağlantısını yapmanın bir yolu aşağıdaki gibi
         */
        Connection connect = null;
        String url = "jdbc:postgresql://localhost:5432/bookstore?user=postgres&password=postgres";
        try{
            connect = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
