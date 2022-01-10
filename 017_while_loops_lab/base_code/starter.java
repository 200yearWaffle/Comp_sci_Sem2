import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Put your name please.");
	String a = sc.nextLine();
	System.out.println("How many times do you wish your name to be outputed?");
	int b = sc.nextInt();
	int count = 0;
	while(true)
	{
		System.out.println(a);
		if(b == count+1)
		{
			break;
		}
		count = count + 1;
	}
	}
}
