package com.java.main.jdbc.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BasicExample {

	public static void main(String[] args) {

		final String driverClass = "oracle.jdbc.driver.OracleDriver";
		final String url = "jdbc:oracle:thin:@localhost:1521:XE";
		final String username = "system";
		final String password = "system";

		Connection con = null;

		Statement stmt = null;

		try {
			Class.forName(driverClass);
			con = DriverManager.getConnection(url, username, password);

			stmt = con.createStatement();

			String sql = "INSERT INTO CUSTOMERS(custid,custname,custmobile,custemail,custaddress) VALUES ('7979','coresrinivas','6363952624','sri@gmail.com','HSR')";

			int updatedrows = stmt.executeUpdate(sql);

			System.out.println("no of records updated:" + updatedrows);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
