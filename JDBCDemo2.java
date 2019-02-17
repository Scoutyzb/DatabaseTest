package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo2 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mybase";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println(con);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM basement WHERE bid = 1");
		while(rs.next()) {
			System.out.println("id="+rs.getInt(1)+" name="+rs.getString("bname")+" price="+rs.getInt("bprice")+" number="+rs.getString("bnumber"));
		}
	}
}
