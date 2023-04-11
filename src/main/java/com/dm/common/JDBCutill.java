package com.dm.common;

import java.sql.*;

public class JDBCutill {
	static final String JDBC_DRVIER = "com.mysql.cj.jdbc.Driver";
	static final String JDBC_URL = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8"; //db서버 db명
	static final String JDBC_USER="root"; //계정
	static final String JDBC_PASS="1111"; //비번
	
	
	static Connection getConnection() {
		try {
			Class.forName(JDBC_DRVIER);
			return DriverManager.getConnection( JDBC_URL , JDBC_USER, JDBC_PASS );
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	static void close(PreparedStatement pstmt, Connection conn) {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			pstmt.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
