package concepts_practise;

import java.util.*;

public class Students  {
	//implements Comparable<Students>
	int age;
	String name;
	
	public Students(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Students a = new Students(1, "r");
		Students b = new Students(10, "ga");
		Students c = new Students(5, "aar");
		Students d = new Students(8, "sury");
		Students e = new Students(6, "rakes");
		
		
		ArrayList<Students> studs = new ArrayList<Students>();
		studs.add(a);
		studs.add(b);
		studs.add(c);
		studs.add(d);
		studs.add(e);
		for (Students students : studs) {
			System.out.println(students.age +" - "+students.name);
		}
		System.out.println("-----");
		Comparator<Students> com = new Comparator<Students>() {
			
			@Override
			public int compare(Students i, Students j) {
				if(i.name.charAt(1)=='a') {
					return -1;
				}
				else return 1;
				}  
			
		};
		
		Collections.sort(studs,com);
		for (Students students : studs) {
			System.out.println(students.age +" - "+students.name);
		}
		
	}
//	@Override
//	public int compareTo(Students that) {
//		
////		if(this.age<that.age) return -1;
////		else return 1;
//		return   that.age - this.age;
//		
//	}
	
}
