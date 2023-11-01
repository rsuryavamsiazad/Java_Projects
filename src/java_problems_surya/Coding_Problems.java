package java_problems_surya;

import java.util.Arrays;

public class Coding_Problems {

	/**
	 * Execute the given function.
	differenceofSum(n.m)(n.m)
	The function takes two integrals m and n as arguments. You are 	required to obtain the total of all integers ranging between 1 to 	n 	(both inclusive) which are not divisible by m. You must also 	return 	the distinction between the sum of integers not divisible 	by m with 	the sum of integers divisible by m.
	Assumption
	m > 0 and n > 0
	Sum lies within the integral range
	Example
	Input:
	m = 6
	n = 30
	Output:
	285
	Integers divisible by 6 are 6, 12, 18, 24, and 30. Their sum is 	90.
	Integers that are not divisible by 6 are 1, 2, 3, 4, 5, 7, 8, 9, 	10, 11, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 25, 26, 27, 28, 	and 29. Their sum is 375.
	The difference between them is 285 (375 – 90).
	Sample input:
	m = 3
	n = 10
	Sample output:
	19
	 */
	public int differenceofSum(int n,int m) {
		int sum1 = 0;
		int sum2=0;
		for (int i = 0; i <= n; i++) {
			if(i%m==0) {
				sum1+=i;
			}
			else {
				sum2+=i;
			}
		}

		return sum2-sum1;
	}
	/**
	 * Execute the given function.
	LargeSmallSum(arr)

	The function takes an integral arr which is of the size or length of 	its arguments. Return the sum of the second smallest element at odd 	position ‘arr’ and the second largest element at the even position.

	Assumption:
	Every array element is unique.
	Array is 0 indexed.
	Note:
	If the array is empty, return 0.
	If array length is 3 or <3, return 0.
	Example
	Input:
	Arr: 3 2 1 7 5 4

	Output:
	7
	Explanation
	The second largest element at the even position is 3.
	The second smallest element at the odd position is 4.
	The output is 7 (3 + 4).
	 * 
	 */

	public void LargeSmallSum(int[] array) {
		if(array.length<3 || array.length==0) {
			System.out.println(0);
		}
		else {
			int even[]=new int [array.length/2];
			int odd[]=new int [array.length/2];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < even.length; j++) {
					if(i%2==0) {
						even[j]=array[i];
						break;
					}
					if(i%2!=0) {
						odd[j]=array[i];
						break;
					}
				}
				Arrays.sort(odd);//with sorting here the elements become form[1,0,0] to [0,0,1] so we can push elements with out loss
				Arrays.sort(even);
			}
			int largestEven = even[even.length-2];
			int smallOdd = odd[(odd.length-odd.length)+1];
			System.out.println(smallOdd+largestEven);
		}
	}
	/**
	 *  
	 *  Perform the function: Int operationchoices(int c, int n, int a, int b). This 	function considers three positive inputs of a, b and c.
	Execute the function to get:
	(a + b), if c = 1
	(a / b), if c = 4
	(a – b), if c = 2
	(a x b), if c = 3

	Example:
	Input:
	a: 12
	b: 16
	c: 1
	Output:
	28
	Explanation
	C = 1, hence the function is (a + b). Hence, the output is 28.
	Sample input:
	a: 16
	b: 20
	c: 2
	Sample output:
	–4
	 * 
	 */

	public int operationchoices(int c, int a, int b) {

		if(c==1) return a+b;
		else if(c==4) return a/b;
		else if(c==2) return a-b;
		else if(c==3) return a*b;
		else return 0;

	}

	/**
	 * Perform the function Int calculate(int m, int n). This function needs two 	positive integers. Calculate the sum of numbers between these two numbers that are 	divisible by 3 and 5.
	Assumption
	m > n > = 0
	Example
	Input:
	m: 12
	n: 50
	Output:
	90

	Explanation
	The numbers between 12 and 50 that are divisible by 3 and 5 are 15, 30, and 45. 	The sum of these numbers is 90.

	Sample input:
	m: 100
	n: 160
	Sample output:
	405
	 * 
	 */
	public int calculate(int m, int n) {
		int sum=0;
		for(int i =m ; i<=n;i++) {
			if(i%3==0&&i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	/**auto biographical number
	 * 
-	 */
	public int autoCount(String n) {
		int zero=0,one=0,result=0;
		if (n.length()>10||n=="")	return 0;
		else {
			//to count the one's and zero's
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i)=='0') zero=zero+1;
				if (n.charAt(i)=='1') one=one+1;
			}}
		// to check whether  the number is autobiographical number and distinct numbers in it
		if (Character.getNumericValue(n.charAt(0))==zero && Character.getNumericValue(n.charAt(1))==one) {
			for (int i = 0; i < n.length(); i++) 
				if (n.charAt(i)!='0') result++; return result;
		} else return 0;
	}

	
	public String isAnagram(String s1,String s2) {
		
		int lenght = s1.length(), check=0;
		for (int i = 0; i < s1.length(); i++) 
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i)==s2.charAt(j)) check++;
			}
		if(check==lenght) return "Anagram";
		else return "Not Anagram";	}
	
	
	public static void main(String[] args) {
		Coding_Problems obj = new Coding_Problems();
		//		int result = obj.differenceofSum(10, 3);
		//		System.out.println("this is a method result: "+result);
		//		int arr[]= {3,2,1,7,5,4};
		//		obj.LargeSmallSum(arr);
		//		System.out.println(obj.operationchoices(1, 16, 12));	
		//		System.out.println(obj.calculate(12, 50));
				System.out.println(obj.isAnagram("race", "caare"));
	}
	
}
