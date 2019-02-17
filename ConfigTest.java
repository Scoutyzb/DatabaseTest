package day32;

import java.sql.Connection;

public class ConfigTest {
	public static void main(String[] args) {
		Connection con = JDBCConfigUtils.getConnection();
		System.out.println(con);
	}
}
