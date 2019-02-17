package day32;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

public class QueryRunnerDemo {
	private static Connection con= JDBCConfigUtils.getConnection();
	public static void insert(String name,int price,String number) {
		QueryRunner qr = new QueryRunner();
		String sql = "INSERT INTO basement (bname,bprice,bnumber) values(?,?,?)";
		Object[] params = {name,price,number};
		int row = 0;
		try {
			row = qr.update(con,sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(row+" lines was run");		
	}
	

}
