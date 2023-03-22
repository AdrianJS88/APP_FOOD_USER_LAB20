import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnect {
    public static Connection ConexiuneDB() throws SQLException {

        String dbURL = "jdbc:postgresql://localhost:5432/grupajava";
        Properties parameters = new Properties();
        parameters.put("user", "postgres");
        parameters.put("password", "postgres");
        Connection conn = DriverManager.getConnection(dbURL, parameters);


        try {
            conn = DriverManager.getConnection(dbURL, parameters);
            if (conn != null) {

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {

                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }


        return conn;
    }
}
