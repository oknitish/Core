package com.java.main.jdbc.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BasicExample {

	public static void main(String[] args) {

		final String driverClass = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@localhost:1521:XE";
		final String username = "system";
		final String password = "system";

		Connection con = null;
		PreparedStatement stmt = null;

		try {
			Class.forName(driverClass);
			con = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO CUSTOMERS VALUES (?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "7777");
			stmt.setString(2, "stephen");
			stmt.setString(3, "9988776655");
			stmt.setString(4, "support@gmail.com");
			stmt.setString(5, "india");

			int updatedrows = stmt.executeUpdate();

			System.out.println("no of records updated:" + updatedrows);
			stmt.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
