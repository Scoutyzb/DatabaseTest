package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	private JDBCUtils() {}
	private static Connection con;
	static{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase", "root","root");
		System.out.println(con);
		}catch ( Exception e){
			throw new RuntimeException(e+"lianjieshibai");
		}
	}
	public static Connection getConnection(){
		System.out.println("love");
		return con;
	}
	public static void close(Connection con ,Statement pst,ResultSet rs) {
		if(con!=null) {
			try{con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}}
		if(rs!=null) {
			try{rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}}	
		if(pst!=null) {
			try{pst.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}}
		}
	public void close(Connection con ,Statement pst) {
		if(con!=null) {
			try{con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}}
		if(pst!=null) {
			try{pst.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}}
		}
		
		
}
