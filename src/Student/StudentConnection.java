package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/StudentDB";
        String user = "root";
        String password = "my-secret-pw";
        Connection con = DriverManager.getConnection(url, user, password);
        return  con;
    }
}
