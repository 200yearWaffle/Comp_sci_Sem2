import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	int a = Math.max(13 - 6 * 11, 30 % 7 * (-2));
	System.out.println(a);
	double b = Math.sqrt(3 * 8 + 31 % 7);
	System.out.println(b);
	double c = Math.pow(37 / 3, 35 % 21);
	System.out.println(c);
	double d = Math.max( Math.pow( 2,14%3) , Math.sqrt ( 2*6) );
	System.out.print(d);
	}
}
