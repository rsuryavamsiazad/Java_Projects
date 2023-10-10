package java_problems_surya;

public class MinofArray {
public static void main(String[] args) {
	String array[] = {"coffee","water","chai","diet coke"};
	String min = array[0];
	int index = 0;
	for (int i = 0; i < array.length; i++) {
		if(array[i].length()<min.length()) {
			min=array[i];
			index =i;
		}
	}
	System.out.println("The min value is: "+ min);
	System.out.println("The index value is: "+ index);
}
}
