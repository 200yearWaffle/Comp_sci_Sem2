import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	String jeff = ("First variable?");
	String jeef = ("Second variable?");
	String jeep = ("Third Variable?");
	System.out.println(jeff);
	int a = sc.nextInt();
	System.out.println(jeef);
	int b = sc.nextInt();
	System.out.println(jeep);
	int c = sc.nextInt();
	String d = ("Your first number is the largest of the three! The number was " + a);
	String e = ("Your second number is the largert of the three! The number was " + b);
	String f = ("Your third number is the largest of the three! The number was " + c);
	String g = ("Your first number is the smallest of the three! The number was " + a);
	String h = ("Your second number is the smallest of the three! The number was " + b);
	String i = ("Your third number is the smallest of the three! The number was " + c);
	if(a>b&&a>c)
	{
	System.out.println(d);
	}
	if(a<b&&a<c)
	{
	System.out.println(g);
	}
	if(b>a&&b>c)
	{
	System.out.println(e);
	}
	if(b<a&&b<c)
	{
	System.out.println(h);
	}
	if(c>a&&c>b)
	{
	System.out.println(f);
	}
	if(c<b&&c<a)
	{
	System.out.println(i);
	}
	}
}
