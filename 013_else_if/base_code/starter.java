import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	Random rand = new Random();
	String jeef = ("Pick a number between 1 - 1000");
	System.out.println(jeef);
	int b = sc.nextInt();
	int a = rand.nextInt(1000)+1;
	String jeb = ("Your answer was correct, the number was " + a + ".");
	String jeff = ("Your number was larger than the number. The number was " + a + ".");
	String jeep =("Your number was smaller than the the number. The number was " + a + ".");
	if(b==a)
	{
		System.out.println(jeb);
	}
	if(b!=a&&b>a)
	{
		System.out.println(jeff);
	}

	else if(b!=a&&b<a)
	{
		System.out.println(jeep);
	}
	}
}
