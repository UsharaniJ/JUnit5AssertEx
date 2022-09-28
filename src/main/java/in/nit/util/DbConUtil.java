package in.nit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConUtil {
	private static Connection con;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}
}
