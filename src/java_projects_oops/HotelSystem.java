package java_projects_oops;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;




public class HotelSystem {
	private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
	private static final String user  = "root";
	private static final String password = "pass123";

	public static void main(String[] args) throws ClassNotFoundException,SQLException, InterruptedException {
		//to load the jdbc drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
		}
		System.out.print("Starting");
		int i = 5;
		while (i!=0) {
			System.out.print(".");
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i--;
		}
		System.out.print("\nEstablishing Connection");
		int p = 3;
		while (p!=0) {
			System.out.print(".");
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			p--;
		}
		System.out.println("\n**Data base Connected Successfully**");
		try {
			Connection connection=DriverManager.getConnection(url,user,password);
			java.sql.Statement statement = connection.createStatement();
			while(true) {
				Scanner input = new Scanner(System.in);
				System.out.println("\nHotel Managment System");
				System.out.println("1.Reserve a room");
				System.out.println("2.View Reservation");
				System.out.println("3.Get Room Number");
				System.out.println("4.Update Reservation");
				System.out.println("5.Delete Reservation");
				System.out.println("0.Exit");
				System.out.print("Enter your Choice: ");
				int choice = input.nextInt();
				System.out.println();
				switch(choice) {
				   case 1:
                       reserveRoom(connection,statement, input);
                       break;
                   case 2:
                       viewReservations(connection,statement);
                       break;
                   case 3:
                       getRoomNumber(connection,statement, input);
                       break;
                   case 4:
                       updateReservation(connection,statement, input);
                       break;
                   case 5:
                       deleteReservation(connection,statement, input);
                       break;
                   case 0:
                	   exit();
                	   input.close();
                	   return;
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		//end
	}

	private static void reserveRoom(Connection connection, java.sql.Statement statement, Scanner input) {
		System.out.println("==Reserve a Room==");
		System.out.print("Enter Guest Name: ");
		String guestName = input.next();
		System.out.print("Enter Room Number: ");
		int roomNumber = input.nextInt();
		System.out.print("Enter the Phone Number: ");
		String phoneNumber = input.next();
		
		String sql = "INSERT INTO reservations( guest_name,room_number,contact_number)"+"Values('"+guestName+"','"+roomNumber+"','"+phoneNumber+"')";
		
		try {
			int result  = statement.executeUpdate(sql);
			
			if (result>0) {
				System.out.println("Reservation Successful");
			}
			else {
				System.out.println("Reservation Unsuccessful or 'Error'");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void viewReservations(Connection connection, java.sql.Statement statement) {
		System.out.println("==All Reservations==\n");
		String sql = "select * from reservations";
		
		try {
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				int reservationId = resultSet.getInt("reservation_id");
				String guestName = resultSet.getString("guest_name");
				int roomNo = resultSet.getInt("room_number");
				String contactNumber = resultSet.getString("contact_number");
				String timeStamp = resultSet.getTimestamp("reservation_date").toString();
				System.out.println("Reservation Id: "+reservationId);
				System.out.println("Guest Name: "+guestName);
				System.out.println("Room NO: "+roomNo);
				System.out.println("Contact NO: "+contactNumber);
				System.out.println("Reservation Date: "+timeStamp);
				System.out.println("--------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getRoomNumber(Connection connection, java.sql.Statement statement, Scanner input) {
		System.out.println("==Get Room Number==");
		System.out.print("Enter Reservation Id: ");
		int reserveId = input.nextInt();
		System.out.print("Enter the Guest Name: ");
		String name=input.next().toLowerCase();
		
		  String sql = "SELECT room_number FROM reservations " +
                  "WHERE reservation_id = " + reserveId +
                  " AND guest_name = '" + name + "'";
		try {
			ResultSet resultSet= statement.executeQuery(sql);
			
			while(resultSet.next()) {
				int roomNo= resultSet.getInt("room_number");
				System.out.println();
				System.out.println("Room NO: "+roomNo+" is Where "+name+" is staying.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void updateReservation(Connection connection, java.sql.Statement statement, Scanner input) {
		System.out.print("Enter the reservation Id to Change ");
		int roomId = input.nextInt();
		
		if (!checkReservtaion(connection,roomId,statement)) {
			System.out.println("Room Id does not exits");
			return;
		}
		
		System.out.print("Enter Guest Name: ");
		String guestName = input.next();
		System.out.print("Enter Room Number: ");
		int roomNumber = input.nextInt();
		System.out.print("Enter the Phone Number: ");
		String phoneNumber = input.next();
		
		String sql = "update reservations set guest_name ='"+guestName+"',room_number = '"+roomNumber+"',contact_number ='"+phoneNumber+"' where reservation_id= '"+roomId+"'";
		
		try {
			int result = statement.executeUpdate(sql);
			if (result>0) {
				System.out.println("Details successfully updated");
			}
			else System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static boolean checkReservtaion(Connection connection, int roomId,java.sql.Statement statement) {
		  try {
	            String sql = "SELECT reservation_id FROM reservations WHERE reservation_id = " + roomId;

	            try (ResultSet resultSet = statement.executeQuery(sql)) {

	                return resultSet.next(); // If there's a result, the reservation exists
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false; // Handle database errors as needed
	        }
	    }

	private static void deleteReservation(Connection connection, java.sql.Statement statement, Scanner input) {
		System.out.print("Enter the reservation Id to Delete ");
		int roomId = input.nextInt();
		
		if (!checkReservtaion(connection,roomId,statement)) {
			System.out.println("Room Id does not exits");
			return;
		}
		
		String sql = "delete from reservations where reservation_id= '"+roomId+"' ";
		try {
			int result = statement.executeUpdate(sql);
			if (result>0) {
				System.out.println("Reservation successfully deleted");
			}
			else {
				System.out.println("Reservation not successfully deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void exit() throws InterruptedException {
		System.out.print("Closing connection with Data Base");
		int b=3;
		while(b!=0) {
			System.out.print(".");
			Thread.sleep(350);
			b--;
		}
		System.out.print("\nExiting the system");
	int x=3;
	while(x!=0) {
		System.out.print(".");
		Thread.sleep(350);
		x--;
	}
	System.out.println("Thanks for using Hotel Managment System");	
	System.out.println("Have a nice Day.");	
	}

	}
