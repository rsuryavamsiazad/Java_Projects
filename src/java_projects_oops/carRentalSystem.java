package java_projects_oops;

import java.util.*;

class Car{
	//for car we have 1.model,2.brand,3.name,4.baseRatePerHour,5.colour
	//we use encapsulation here
	private String carId ,brand,name,colour;
	private double baseRatePerHour;//double beacuse of decimal value
	private boolean isAvailable;
	//lets create a parameterised constructor for the class rather than a method we can enter values directly 	rather than invoking a method
	//we are not creating a default constructor again
	public Car(String model,String brand,String name,double baseRatePerHour,String colour ) {
		this.carId=model;
		this.brand=brand;
		this.name=name;
		this.baseRatePerHour=baseRatePerHour;
		this.colour=colour;
		this.isAvailable=true;
	}
	//we got all the getter methods
	public String getcarId() {
		return carId;
	}
	public String getBrand() {
		return brand;
	}
	public String getName() {
		return name;
	}
	public String getColour() {
		return colour;
	}
	public double getbaseRatePerHour() {
		return baseRatePerHour;
	}
	//to calculate the fare based on number of days
	public double totalFare(int days) {
		return days*baseRatePerHour;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void rent () {
		isAvailable=false;
	}
	public void returnCar() {
		isAvailable=true;
	}

}
class Customer{
	private String name ,customerId;
	public Customer(String customerId,String name) {
		this.name=name;
		this.customerId=customerId;
	}
	public String getName() {
		return name;
	}
	public String getCustomerId() {
		return customerId;
	}
}

class Rental{
	private Car car;
	private Customer customer;
	private int days;

	public Rental(Car car,Customer customer,int days) {
		this.car=car;
		this.customer=customer;
		this.days=days;
	}

	public Car getCar() {
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getDays() {
		return days;
	}

}

class RentalSystem{
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;

	public RentalSystem() {
		cars = new ArrayList<>();
		customers = new ArrayList<>();
		rentals = new ArrayList<>();
	}

	public void addCar(Car car) {
		cars.add(car);
	}
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void rentCar(Car car,Customer customer,int days) {
		if(car.isAvailable()) {
			car.rent();
			rentals.add(new Rental(car, customer, days));
		}
		else System.out.println("car is not available");
	}

	public void returnCar(Car car) {
		car.returnCar();
		Rental toremove = null;
		for (Rental rental : rentals) {
			if(rental.getCar()==car) {
				toremove=rental;
				break;
			}
		}
		if (toremove!=null) {
			rentals.remove(toremove);
		}
		else {
			System.out.println("car is not rented");
		}

	}
	public void login() {
		System.out.print("Starting");
		int i = 7;
		while (i!=0) {
			System.out.print(".");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i--;
		}
		System.out.print("\nChecking for Errors");
		int p = 7;
		while (p!=0) {
			System.out.print(".");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			p--;
		}
		System.out.print("\nLoading Data");
		int f = 4;
		while (f!=0) {
			System.out.print(".");
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			f--;
		}
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("\nWelcome,to Radha Rental Services");
		System.out.println("1.Admin login");
		System.out.println("2.Booking Page");
		System.out.print("select 1 or 2: \n");
		int select = input.nextInt(); 
		if(select==1) {
			System.out.println("Enter the pass key");
			String passKey = input.next().toLowerCase();
			String Surya = "123sam";
			String Vamsi = "123vam";
			if (passKey.equals(Surya)|| passKey.equals(Vamsi)) {
				if(passKey.equals(Surya)) {
					System.out.println("welcome Surya");
				}
				if(passKey.equals(Vamsi)) {
					System.out.println("welcome Vamsi");
				}
			}
			else {
				System.out.println("-*-*-enter vaild pass key-*-*-");
			}

			System.out.println("--Admin page under maintenance--");
			System.out.println("\n**Press '0' to go to Booking page**");
			int menu = input.nextInt();
			if (menu==0) {
				menu();
			}
		}
		else if (select ==2) {
			menu();
		}
		input.close();
	}
	public void menu() {
		System.out.println();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome,to Radha Rental Services");
			System.out.println("1. Available cars ");
			System.out.println("2. Rent a car");
			System.out.println("3. Return a car ");
			System.out.println("4. Exit");
			System.out.print("Enter ur choice ");
			int choice = input.nextInt();
			System.out.println();

			if (choice == 1) {
				System.out.println("==Available cars==\n");
				for (Car car : cars) {
					if(car.isAvailable()) {
						System.out.println(car.getcarId()+" - "+" "+car.getBrand()+" "+car.getName()+" - "+car.getColour());}
				}
				System.out.println("\n");
			}

			else if (choice ==  2) {
				System.out.println("==Rent a Car==\n");
				System.out.print("Enter your name ");
				String customerName=input.next();

				System.out.println("\n==Availble cars==\n");
				for (Car car : cars) {
					if(car.isAvailable()) {
						System.out.println(car.getcarId()+" - "+" "+car.getName()+" - "+car.getColour());
					}
				}
				System.out.print("\n");

				System.out.print("Enter the carId you want: ");
				String carId=input.next();

				System.out.print("How many days u want the car: ");
				int days = input.nextInt();

				Customer newCustomer = new Customer("cus"+(customers.size()+1), customerName);
				customers.add(newCustomer);

				Car carSelected = null;
				for (Car car : cars) {
					if(car.getcarId().equals(carId)&&car.isAvailable()) {
						carSelected =car;
						break;
					}
				}
				if (carSelected!=null) {
					double totalPrice = carSelected.totalFare(days);
					System.out.println("\n");
					System.out.println("==rental information==");
					System.out.println("customerID: "+newCustomer.getCustomerId());
					System.out.println("customer name: "+newCustomer.getName());
					System.out.println("selected car: "+carSelected.getcarId() +" "+ carSelected.getBrand()+" "+carSelected.getName()+" "+carSelected.getColour() );
					System.out.println("Total Fare: "+totalPrice);
					System.out.print("would u like to confirm: (y/n): \n");
					char confirm = input.next().toLowerCase().charAt(0);

					if (confirm=='y') {
						rentCar(carSelected, newCustomer, days);
						System.out.println("car rented succesfull\n");
					}
					else {
						System.out.println("rent cancelled\n");
					}
				}

				else {
					System.out.println("invaild selection or car unavailable");
				}
			}
			else if(choice == 3) {
				System.out.print("enter the car model u want to return: ");
				String model = input.next();
				Car carToReturn = null;
				for (Car car : cars) {
					if (car.getcarId().equals(model)&&!car.isAvailable()) {
						carToReturn=car;
						break;
					}
				}
				if(carToReturn!=null) {
					Customer customer =null;
					for (Rental rental : rentals) {
						if(rental.getCar()==carToReturn) {
							customer = rental.getCustomer();
							break;
						}
					}
					if(customer!=null) {
						returnCar(carToReturn);
						System.out.println("car return succesful"+" "+customer.getName().toUpperCase()+"\n");
					}
					else {

						System.out.println("car was not rented or rental info missing");
					}
				}
				else {
					System.out.println("enter vaild car model");
				}
			}
			else if (choice == 4) {
				System.out.print("Exiting System");
				int l = 7;
				while (l!=0) {
					System.out.print(".");
					try {
						Thread.sleep(350);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					l--;
				}
				System.out.println("\nThanks for chossing Radha Rental Services");
				System.out.println("Have a nice day 😀");
				break;
			}
			else {
				System.out.println("Please enter valid choice");
			}
		}
		input.close();

	}
}

public class carRentalSystem {
	public static void main(String[] args) {
		RentalSystem sys=new RentalSystem();
		Car s1 =new Car("001","BMW","520d",500.47,"Black");
		Car s2 =new Car("002","Hyndai","Verna",200.23,"Yellow");
		Car s3 =new Car("003","Ford","Mustang",250.89,"Brown");
		sys.addCar(s1);
		sys.addCar(s2);
		sys.addCar(s3);

		sys.login();
	}
}
