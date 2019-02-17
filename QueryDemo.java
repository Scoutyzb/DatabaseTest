package day32;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class QueryDemo {
	public static void  query()throws SQLException {
		Connection con = JDBCConfigUtils.getConnection();
		QueryRunner qr =new QueryRunner();
		String sql = "SELECT * FROM basement";
		Object[] ob = qr.query(con, sql, new ArrayHandler());
		for(Object o:ob) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) throws SQLException{
		query1();
	}
	public static void  query1()throws SQLException {
		Connection con = JDBCConfigUtils.getConnection();
		QueryRunner qr =new QueryRunner();
		String sql = "SELECT * FROM basement";
		Sort ob = qr.query(con, sql, new BeanHandler<Sort>(Sort.class));
		System.out.println(ob);
		
	}
}
