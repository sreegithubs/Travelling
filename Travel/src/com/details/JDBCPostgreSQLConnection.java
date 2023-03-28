package com.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCPostgreSQLConnection {
	static Connection c = null;
	static Statement stmt = null;

	

		

	

	public static void createTable(Cusdetails cd) {
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Sree@123");
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "CREATE TABLE Journerydetails" + "(NAME TEXT NOT NULL," + "MOBILE_NO VARCHAR(10) NOT NULL," +"AGE INT NOT NULL,"+ "DAY INT NOT NULL," +"DESTINATION TEXT NOT NULL)";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Table created successfully");

	}

//	public static void selectDetails( ) {
//		try {
//			Class.forName("org.postgresql.Driver");
//			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Sree@123");
//			c.setAutoCommit(false);
//			System.out.println("Opened database successfully");
//
//			stmt = c.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM Jdetails;");
//			while (rs.next()) {
//
//				String Name = rs.getString("Name");
//				int Number = rs.getInt("Number");
//				int day = rs.getInt("day");
//
//				System.out.println("NAME = " + Name);
//				System.out.println("number = " + Number);
//				System.out.println("day = " + day);
//
//				System.out.println();
//			}
//			rs.close();
//			stmt.close();
//			c.close();
//		} catch (Exception e) {
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//			System.exit(0);
//		}
//		System.out.println("Operation done successfully");
//
//	}

	public void save(Cusdetails cd) {
		try {
//			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Sree@123");
//			c.setAutoCommit(false);
			System.out.println("Opened database successfully");
			stmt = c.createStatement();
			String sql = "INSERT INTO public.Journerydetails(\r\n"
					+ "	name, mobile_no, age, day,destination)\r\n"
					+ "	VALUES (?, ?, ?, ?, ?);";

	
			
			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, cd.getName());
			ps.setString(2, cd.getMobileNumber());
			ps.setInt(3, cd.getAge());
			ps.setInt(4, cd.getDay());
			ps.setString(5, cd.getDestination());

			
			int rowsInserted = ps.executeUpdate();
            System.out.println(rowsInserted + " rows inserted.");
			
//			ps.execute();
			
			

//			int rowCount = ps.executeUpdate();
//			if (rowCount == 1) {
//				System.out.println("Account Created");
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

}

	}
