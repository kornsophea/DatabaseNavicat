
package databasenavicate;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private static Connection con;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/moon", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
