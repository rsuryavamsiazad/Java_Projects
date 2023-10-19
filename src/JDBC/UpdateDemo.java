package JDBC;

import java.sql.*;

public class UpdateDemo {
	public static void main(String[] args) throws Exception {
		String city1="chittor";
		String email1 ="rahul12@gmail.com";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","pass123");
		PreparedStatement ps=con.prepareStatement("update register set city=? where email=?");
		ps.setString(1, city1);
		ps.setString(2, email1);

		int result=	ps.executeUpdate();
		if(result>0) System.out.println("Updated");
		else System.out.println("Not Updated");



	}
}
