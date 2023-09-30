package assingments;

import java.util.*;

public class Min_value implements Comparator<Integer>	 {
	@Override
	public int compare(Integer i, Integer j) {
		if(i<j) {
			return 1;
		}
		else return -1;
	};

public static void main(String[] args) {
	Integer[] nums = new Integer[] {5,9,22,33,45,88,2,69,14};
	PriorityQueue<Integer> num = new PriorityQueue<Integer>(new Min_value());
	num.add(5);
	num.add(9);
	num.add(22);
	num.add(33);
	num.add(45);
	num.add(88);
	num.add(1);
	System.out.println("Priority Queue"+num);
	System.out.println("The max value of the list(priority queue): " + num.poll());
	System.out.println();
	
	PriorityQueue<Integer> num2 = new PriorityQueue<Integer>(Arrays.asList(nums));
	System.out.println("Priority Queue"+num2);
	System.out.println("The min value of the list(priority queue): " + num2.poll());
	System.out.println();
	
	
	
	
	
	//here i used arrays .sort to sort my list before sending it to collection
	Arrays.sort(nums);
	ArrayDeque<Integer> num3 = new ArrayDeque<Integer>(Arrays.asList(nums));	
	System.out.println("Array Deque"+num3);
	System.out.println("The min value of the list(Array Deque): " + num3.poll());
	
	
}
}
