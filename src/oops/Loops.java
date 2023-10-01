package oops;

public class Loops {
/**
 * Loop is nothing but iterating a piece of code n number of time
 * (Entry control loop)
 * while loop 
 * for loop
 * 
 * do while loop (exit control loop)
 */
	
	public static void main(String[] args) {
		//for loop (if we know for how long the loop iterates)
		//1 to 10 numbers
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		/* syntax: 
		  	for(initialize;condition;increment or decrement)
		  			{
							piece of code;
					}
		*/
		//this prints the numbers form 1 to 100
//		for(int i = 0;i<=100;i++) {//i++(i=i+1);
//			System.out.println(i);
//		}
//		
		
		
		
		/* While loop - we use it when we dont know how many iterations can it
		 * take to meet the given condition
		 * syntax:
		 * initialization
		 * while(condition)
		 * {
		 * piece of code;
		 * incerement or decrement
		 * }
		 */
		
//		int i =5;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		/*
		 * do-while loop 
		 * the code will execte atleast one time before
		 * checking the condition
		 * 
		 */
		int i =0;
		do 	{
			System.out.println(i);
			i++;
			}
		while(i>10);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
