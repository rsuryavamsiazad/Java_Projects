package java_problems_surya;
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
	int i = 1;
	int v = 5;
	int x = 10;
	int l = 50;
	int c = 100;
	int d = 500;
	int m = 1000;
	
	String input = "IX";
	int value = 0;
	char[] k = input.toCharArray();
	for(int j =0;j<k.length;j++) {
		if(k[j]=='I') {
			value+=i;
		}
		if(k[j]=='L') {
			value+=l;
		}
		if(k[j]=='V'||k[j-1]=='I') {
			value+=v-i-1;
		}
		if(k[j]=='X') {
			value+=x;
		}
		if(k[j]=='C') {
			value+=c;
		}
		if(k[j]=='D') {
			value+=d;
		}
		if(k[j]=='M') {
			value+=d;
		}
	}
	System.out.println(value);
}
}
