package assingments;
import java.util.*;
public class AllPositiveNumbers {
	public static void main(String[] args) {
		Integer[] nums = new Integer[] {-5,9,-22,-33,45,-88,2,69,14};
		ArrayDeque<Integer> num = new ArrayDeque<Integer>(Arrays.asList(nums));
		System.out.println("Priority Queue"+num);
		System.out.println("Using for each");
		for (Integer integer : num) {
			if(integer>0) {
				System.out.println(integer);
			}
		}
		System.out.println("--------");
		System.out.println("Using for Iterator");
		Iterator<Integer> itr = num.iterator() ;
		while(itr.hasNext()) {
			//Here we store it in a varible for not causing errors 
			//Because .next points to the next element in the list
			int a = itr.next();
			if(a>0) {
				System.out.println(a);
			}
		}
	}
}
