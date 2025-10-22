import db.DBConnection;
import java.sql.Connection;
import model.LoginPage;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
            }
            LoginPage loginPage = new LoginPage();
        } catch (Exception e) {
            System.out.println("❌ Connection failed:");
            e.printStackTrace();
        }
    }
}
