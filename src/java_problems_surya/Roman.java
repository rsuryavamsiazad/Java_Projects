package java_problems_surya;

import java.util.*;

/**
 * I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
public class Roman {
public static void main(String[] args) {
	HashMap<Character, Integer> num = new HashMap<>();
	num.put('i', 1);	
	num.put('v', 5);	
	num.put('x', 10);	
	num.put('l', 50);	
	num.put('c', 100);	
	num.put('d', 500);	
	num.put('m', 1000);	
	int value = 0;
	String input = "IX";
	char[] k = input.toLowerCase().toCharArray();
//	for (char c : k) {
//		System.out.println(c);
//	}
	for (int i = 0; i < k.length; i++) {
		if() {
			
		}
		else {
		value+=num.get(k[i]);
		}
	}
	System.out.println(value);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int i = 1;
//	int v = 5;
//	int x = 10;
//	int l = 50;
//	int c = 100;
//	int d = 500;
//	int m = 1000;
	
//	String input = "IX";
//	int value = 0;
//	char[] k = input.toCharArray();
//	for(int j =0;j<k.length;j++) {
//		if(k[j]=='I') {
//			value+=i;
//		}
//		if(k[j]=='L') {
//			value+=l;
//		}
//		if(k[j]=='V'||k[j-1]=='I') {
//			value+=v-i-1;
//		}
//		if(k[j]=='X') {
//			value+=x;
//		}
//		if(k[j]=='C') {
//			value+=c;
//		}
//		if(k[j]=='D') {
//			value+=d;
//		}
//		if(k[j]=='M') {
//			value+=d;
//		}
//	}
//	System.out.println(value);
}
}
