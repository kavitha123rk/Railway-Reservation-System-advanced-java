import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/railway_system",
                "root",
                "root123"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
