package JDBC;

import java.sql.*;

public class ResultSetDemo {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","pass123");
		
		PreparedStatement ps=con.prepareStatement("select * from register");

		ResultSet result=ps.executeQuery();

		while(result.next()) {
			System.out.println("Name:"+result.getString("name"));
			System.out.println("Email:"+result.getString("email"));
			System.out.println("Password:"+result.getString("password"));
			System.out.println("Gender:"+result.getString("gender"));
			System.out.println("City:"+result.getString("city"));
			System.out.println("---------------");
		}
	}
}
