//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectDatabase {
    public static Connection con = null;
    private static ConectDatabase instance = new ConectDatabase();

    public ConectDatabase() {
    }

    public static ConectDatabase getInstance() {
        return instance;
    }

    public void connect() {
        String url = "jdbc:mysql://localhost:3306/pharmacy_manager";
        String user = "root";
        String password = "minhmamA891";

        try {
//            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successfully");
        } catch (SQLException var5) {
            var5.printStackTrace();
            System.out.println("Connection failed");
        }
//        catch (ClassNotFoundException var6) {
//            var6.printStackTrace();
//            System.out.println("Connection failed");
//        }
    }

    public static void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException var1) {
                var1.printStackTrace();
            }
        }

    }

    public static Connection getConnection() {
        return con;
    }
}
