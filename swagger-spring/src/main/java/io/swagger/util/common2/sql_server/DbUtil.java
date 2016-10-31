package io.swagger.util.common2.sql_server;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static Connection getConnect() {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=StuDB";
		String userName = "sa"; // 默认用户名
		String userPwd = "sa"; // 密码
		Connection dbConn = null;
		try {
			Class.forName(driverName);
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
			// System.out.println("连接成功！"); // 如果连接成功，控制台输出“连接成功！”
			return dbConn;
		} catch (Exception e) {
			System.out.println("连接失败！");
		}
		return null;
	}
}