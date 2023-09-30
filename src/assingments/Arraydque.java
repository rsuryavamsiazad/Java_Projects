package assingments;

import java.util.*;

public class Arraydque {
		public void addMethods() {
			System.out.println("Add methods:");
			ArrayDeque<String> arr1 = new ArrayDeque<>();
			arr1.add("1 first elemet (tail)");
			arr1.addFirst("2 second elemet (head)");
			arr1.addLast("3 third elemet (tail)");
			System.out.println("Adding elements using add methods:"+arr1);
			arr1.offer("4 fourth elemet (tail)");
			arr1.offerFirst("5 fifth elemet (head)");
			arr1.offerLast("6 sixth elemet (tail)");
			System.out.println("Adding elements using offer methods:"+arr1);
			arr1.push("7 seventh elemet (head)");
			System.out.println("Adding elements using push methods:"+arr1);
			

		}
		public void removeMethods() {
			System.out.println("Remove methods:");
			Integer[] num = new Integer[] {1,2,3,4,5,6,7,8,9,10} ;
			ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>(Arrays.asList(num));
			System.out.println("The list: "+arr1);
			System.out.println("Removes Head element remove method: "+arr1.remove());
			System.out.println("Removes Head element poll method: "+arr1.poll());
			System.out.println("Removes Tail element removeLast method: "+arr1.removeLast());
			System.out.println("Removes Tail element pollLast method: "+arr1.pollLast());
			//FIFO method
			System.out.println("Removes Head element pop method: "+arr1.pop());
			arr1.clear();
			System.out.println("Removes all elements clear method: "+arr1);
			System.out.println("---------------------");
		}
		
		public void retrieveMethods() {
			System.out.println("Retrieve methods:");
			Integer[] num = new Integer[] {1,2,3,4,5,6,7,8,9,10} ;
			ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>(Arrays.asList(num));
			System.out.println("The list: "+arr1);
			//it only retrieves the head element and tail element but do not remove it
			System.out.println("Retrives Head element peek method: "+arr1.peek());
			System.out.println("Retrives Tail element peekLast method: "+arr1.peekLast());
			System.out.println("Retrives Head element getfirst method: "+arr1.getFirst());
			System.out.println("Retrives Tail element getlast method: "+arr1.getLast());
			System.out.println("---------------------");
		}
		
		public void otherMethods() {
			System.out.println("Other methods:");
			ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>();
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
			Integer[] num = new Integer[] {1,2,3,4,5,6,7,8,9,10} ;
			ArrayDeque<Integer> arr1 = new ArrayDeque<Integer>(Arrays.asList(num));
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
			System.out.println("while method to print using poll");
			while(!arr1.isEmpty()) {
				System.out.println(arr1.poll());
			}
			System.out.println("**");
			System.out.println("while method to print reverse using pollLast");
			ArrayDeque<Integer> arr2 = new ArrayDeque<Integer>(Arrays.asList(num));
			while(!arr2.isEmpty()) {
				System.out.println(arr2.pollLast());
			}
			System.out.println("---------------------");
		}
		public static void main(String[] args) {
			Arraydque p = new Arraydque();
			p.addMethods();
			p.removeMethods();
			p.retrieveMethods();
			p.otherMethods();
			p.travesalMethods();
		}
	}


