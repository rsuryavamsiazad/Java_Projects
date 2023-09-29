package assingments;
import java.util.*;
/**
 * Priority queue is a class which implements queue interface
 * Default capacity is 11
 */
public class PriorityQue { 
	
	public void addMethods() {
		System.out.println("Add methods:");
		PriorityQueue<Integer> arr1 = new PriorityQueue<Integer>();
		arr1.add(3);
		arr1.add(0);
		arr1.add(1);
		System.out.println("Adding elements using add methods:"+arr1);
		arr1.offer(5);
		arr1.offer(6);
		System.out.println("Adding elements using offer methods:"+arr1);
		System.out.println("---------------------");

	}
	public void removeMethods() {
		System.out.println("Remove methods:");
		PriorityQueue<Integer> arr1 = new PriorityQueue<Integer>();
		arr1.add(3);
		arr1.add(0);
		arr1.add(1);
		System.out.println("Removes Head element remove method: "+arr1.remove());
		System.out.println("Removes Head element poll method: "+arr1.poll());
		arr1.clear();
		System.out.println("Removes all elements clear method: "+arr1);
		System.out.println("---------------------");
	}
	
	public void retrieveMethods() {
		System.out.println("Retrieve methods:");
		PriorityQueue<Integer> arr1 = new PriorityQueue<Integer>();
		arr1.add(3);
		arr1.add(0);
		arr1.add(1);
		//it only retrieves the head element do not remove it
		System.out.println("Retrives Head element peek method: "+arr1.peek());
		System.out.println("---------------------");
	}
	public void otherMethods() {
		System.out.println("Other methods:");
		PriorityQueue<Integer> arr1 = new PriorityQueue<Integer>();
		arr1.add(3);
		arr1.add(0);
		arr1.add(1);
		System.out.println("checks if the element is present contains method: "+arr1.contains(1));
		System.out.println("Returns no of elements in the array size method: "+arr1.size());
		System.out.println("Returns whether  elements are present or not in the array? isEmpty method: "+arr1.isEmpty());
		System.out.println("---------------------");
	}
	public void travesalMethods() {
		System.out.println("Travesal methods:");
		PriorityQueue<Integer> arr1 = new PriorityQueue<Integer>();
		arr1.add(3);
		arr1.add(0);
		arr1.add(1);
		arr1.add(2);
		System.out.println("ForEach method");
		for (Integer integer : arr1) {
			System.out.println(integer);
		}
		Iterator<Integer> itr = arr1.iterator();
		System.out.println("**");
		System.out.println("Iterator method");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**");
		System.out.println("while method to print in priority");
		while(!arr1.isEmpty()) {
			System.out.println(arr1.poll());
		}
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		PriorityQue p = new PriorityQue();
		p.addMethods();
		p.removeMethods();
		p.retrieveMethods();
		p.otherMethods();
		p.travesalMethods();
	}
}
