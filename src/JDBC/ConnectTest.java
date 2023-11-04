package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ConnectTest {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("enter name");
		String name = input.nextLine();
		System.out.println("enter email");
		String email = input.nextLine();
		System.out.println("enter password");
		String password = input.nextLine();
		System.out.println("enter gender");
		String gender = input.nextLine();
		System.out.println("enter city");
		String city = input.nextLine();
		
		//using variable names
		/*String name = "samantha";
		String email = "sam143@gmail.com";
		String password = "143surya";
		String gender = "female";
		String city = "hyderabad";*/

		//	step 1 to establish connection 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 2 establishing connection with server
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/node", "root", "pass123"); 
		
		
		// step 3 updating the values
		//type 1 to enter values
		//PreparedStatement ps=con.prepareStatement
		//		("insert into register values('surya','surya@gmail.com','123','male','proddatur')");
		//type 2 to entering values using variable
		//PreparedStatement ps=con.prepareStatement
			//	("insert into register values('"+name+"','"+email+"','"+password+"','"+gender+"','"+city+"')");
		//type 3 positional parameters
		PreparedStatement ps=con.prepareStatement
				("insert into register values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, city);
		
		//executing the statement using update
		int i =ps.executeUpdate();
		//printing success msg as above statement returns int as return
		if (i>0) {
			System.out.println("saved to table node");
		}
		else System.out.println("error not save");
		//need to close connection and input stream after completion
		con.close();
		input.close();
	}
}
