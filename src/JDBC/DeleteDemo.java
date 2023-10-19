package JDBC;

import java.sql.*;

public class DeleteDemo {
	public static void main(String[] args) throws Exception {
		String email1 ="rahul12@gmail.com";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","pass123");
		PreparedStatement ps=con.prepareStatement("delete from register where email=?");
	
		ps.setString(1, email1);

		int result=	ps.executeUpdate();
		if(result>0) System.out.println("Deleted");
		else System.out.println("Not Deleted");



	}
}
