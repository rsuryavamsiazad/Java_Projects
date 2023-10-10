package concepts_practise;

public class PojoClass {
	private int id;
	protected String name;
	public int salary;
	public PojoClass() {
		
	}
	public PojoClass(int number ) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

class Employee {
	public static void main(String[] args) {
		PojoClass e1 = new PojoClass();
		e1.name="surya";
		e1.salary=30000;
		e1.setId(007);
		PojoClass e2 = new PojoClass();
		e2.name="naveen";
		e2.salary=20000;
		e2.setId(8);
		PojoClass e3 = new PojoClass();
		e3.name="ram";
		e3.salary=3000;
		e3.setId(005);
		
//		System.out.println(e1.name);
//		System.out.println(e1.salary);
//		System.out.println(e1.getId());
		
		PojoClass [] em = new PojoClass[] {e1,e2,e3};
		int sal = 0;
		for (PojoClass p : em) {
		System.out.println(p.getId()+"-"+p.name+"-"+p.salary);
		sal+=p.salary;
		}
		System.out.println("there total salary of three employee we pay: "+sal);
		
	}
}