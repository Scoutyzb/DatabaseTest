package day31;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils2 {
	private JDBCUtils2(){}
	
	
	
	public static void close(Connection con,Statement stat , ResultSet rs){
		 if(rs!=null){
			 try{
				 rs.close();
			 }catch(SQLException ex){}
		 }
		 
		 if(stat!=null){
			 try{
				 stat.close();
			 }catch(SQLException ex){}
		 }
		 
		 if(con!=null){
			 try{
				 con.close();
			 }catch(SQLException ex){}
		 }
		 
	}
}