package projetojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    static Connection connection;

    public static Connection getConnection(){
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto","isabela","admin1234");
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        }
        return connection;
    }
}
