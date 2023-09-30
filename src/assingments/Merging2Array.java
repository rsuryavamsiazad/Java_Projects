package assingments;

import java.util.Arrays;

public class Merging2Array {

	public static void main(String[] args) {
		//this is first array
		int [] array1 = new	int [] {1,2,3,4,5};
		//this is second array
		int [] array2 = new	int [] {6,7,8,9,10};
		//this is a third array to store the new combined array
		int [] array3 = new int [array1.length+array2.length];

		//so we need to store the array1 and array2 into the new array

		//so we use a loop to iterate over each element in the array and add to the array3
		for(int i = 0;i<array1.length;i++) {
			array3[i]=array1[i];
		}
		//so now we added the first array into the array3 using above loop
		//now we need to add the second array2 but we need becarful with the index position
		//the index position need to start from the end of array1.length
		for (int i = 0; i < array2.length; i++) {
			array3[array1.length+i]=array2[i];
			//array3[array1.length+i] here we used this statment as we need to start the index position
			//from the end of array1.length
		}
		
		System.out.println("This is array1:"+Arrays.toString(array1));
		System.out.println("This is array2:"+Arrays.toString(array2));
		System.out.println("This is combined(array1 +array2)array3:"+Arrays.toString(array3));
}
}

