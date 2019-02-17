package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class JDBCDemo3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase", "root","root");
		System.out.println(con);
		String sql = "INSERT INTO basement(bname,bnumber) values(?,?)";
		PreparedStatement stat = con.prepareStatement(sql);
		stat.setString(2, "13012402130");
		stat.setString(1, "dianfi");
		stat.close();
		String sql2 = "DELETE FROM basement WHERE bid = ?";
		
		PreparedStatement stat2 = con.prepareStatement(sql2);
		stat2.setInt(1, 6);
		stat2.executeUpdate();
		stat2.close();
		con.close();		
	}
}
