package day32;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.SynchronousQueue;

public class JDBCConfigUtils {
	private static Connection con;
	private static String url;
	private static String password;
	private static String user;
	private static String driver;
	static {
		
		try {
			readConfig();
			Class.forName(driver);		
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	private static void readConfig() {
		InputStream is = JDBCConfigUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties pro = new Properties();
		try {
		pro.load(is);
		}catch(IOException e) {
			e.printStackTrace();
		}
		driver = pro.getProperty("driver");
		user = pro.getProperty("user");
		password = pro.getProperty("password");
		url = pro.getProperty("url");
	}
	public static Connection getConnection() {
		
		return con;
	}

	}
