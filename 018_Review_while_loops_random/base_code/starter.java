import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Pick a random number.");
	int a = sc.nextInt();
	int b = rand.nextInt(1001);
	if(a==b)
	{
		System.out.println("You got it first try!");
		System.out.print("The random number was " + b);
	}
	while(a!=b)
	{
		System.out.println("Try again.");
		a = sc.nextInt();
		if(a==b)
		{
			System.out.println("Good job, you got it!");
			System.out.print("The random number was " + b);
			break;
		}
	}
	}
}
