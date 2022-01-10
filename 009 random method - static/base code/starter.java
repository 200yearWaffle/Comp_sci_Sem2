import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int a = rand.nextInt(10);
		int b = rand.nextInt(100)+1;
		double c = rand.nextDouble() + rand.nextInt(1)+2.5;
		double d = rand.nextDouble() + rand.nextInt(575)+14;
		System.out.print("A number between 0-9:");
		System.out.println(a);
		System.out.print("A number between 1-100:");
		System.out.println(b);
		System.out.print("A number between 2.5-3.5:");
		System.out.println(c);
		System.out.print("A number between 14-589:");
		System.out.println(d);
	}
}
