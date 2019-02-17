package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException  {
	Class.forName("com.mysql.jdbc.Driver");
	String url ="jdbc:mysql://localhost:3306/mybase";
	String user = "root";
	String pass = "root";
	Connection con = DriverManager.getConnection(url, user, pass);
	System.out.println(con);
	Statement  s=  con.createStatement();
	System.out.println(s.executeUpdate("UPDATE basement SET bprice = 5000 WHERE bname = 'phone'" ));
	ResultSet rs =	s.executeQuery("SELECT *  FROM basement");
	while(rs.next()) {
		System.out.println(rs.getInt("bid")+"..." +rs.getString("bname")+"..."+rs.getInt("bprice")+"..."+rs.getString("bnumber"));
	};
	rs.close();
	con.close();
	s.close();
	}
}
