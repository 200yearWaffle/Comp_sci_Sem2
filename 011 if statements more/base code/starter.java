import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	String g = ("What is the first variable?");
	String h = ("What is the second variable?");
	String jake = ("The first variable is: ");
	String jeff = ("The second variable is: ");
	String c = ("The variables are the same");
	String d = ("The variables are different");
	System.out.println(g);
	int a = sc.nextInt();
	System.out.println(h);
	int b = sc.nextInt();
	System.out.println(jake + a);
	System.out.println(jeff + b);
	if(a==b)
	{
	System.out.println(c);
	}
	if(a!=b)
	{
	System.out.println(d);
	}
	}
}
