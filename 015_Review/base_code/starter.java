import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("What is your name?");
	String n = sc.nextLine();
	System.out.println("What is your title? Ex: Slayer of Dragons");
	String t = sc.nextLine();
	System.out.println("Whould you like to be a Wizard, Warrior, or Rogue?");
	String ra = sc.nextLine();
	String wz = ("Wizard");
	String wz2 = ("wizard");
	String wa = ("Warrior");
	String wa2 = ("warrior");
	String ro = ("Rogue");
	String ro2 = ("rogue");
	String jeef = ("You've chosen the Wizard! Excelsior!");
	String jeep = ("You've chosen the Warrior! For honor!");
	String jeb = ("You've chosen the Rogue! How cunning!");
	String jebb = ("You've decided not to choose a role. Please rerun the program.");
if(ra.equals(wz) || ra.equals(wz2))
	{
		System.out.println(jeef);
	}
	else if(ra.equals(wa) || ra.equals(wa2))
	{
		System.out.println(jeep);
	}
	else if(ra.equals(ro) || ra.equals(ro2))
	{
		System.out.println(jeb);
	}
	else if(!ra.equals(wz) && !ra.equals(wa) && !ra.equals(ro) && !ra.equals(wz2) && ra.equals(wa2) && ra.equals(ro2))
	{
		System.out.println(jebb);
	}
	System.out.println("You have 25 skill points to spend in the following: Stength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
	System.out.print("Strength 1-10:");
	int s = sc.nextInt();
	int ss = 0;
	int sa = 0;
	int ssa = 0;
	if(s<=10)
	{
		sa = 25-s;
		System.out.println("You have " + sa + " points left.");
	}
	else if(s>10)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Strength 1-10:");
		ss = sc.nextInt();
		ssa = 25-ss;
		System.out.println("You have " + ssa + " points left.");
	}
	System.out.print("Dexterity 1-10:");
	int d = sc.nextInt();
	int dd = 0;
	int da = 0;
	int dda = 0;
	if(d<=10 && s<=10)
	{
	da = sa-d;
	System.out.println("You have " + da + " points left.");
	}
	else if(d<=10 && s>10)
	{
		da = ssa-d;
		System.out.println("You have " + da + " points left.");
	}
	else if(d>10 && s<=10)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Dexterity 1-10:");
		dd=sc.nextInt();
		dda = sa-dd;
		System.out.println("You have " + dda + " points left.");
	}
	else if(d>10 && s>10)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Dexterity 1-10:");
		dd=sc.nextInt();
		dda = ssa-dd;
		System.out.println("You have " + dda + " points left.");
	}
	System.out.print("Intelligence 1-10:");
	int i = sc.nextInt();
	int ii = 0;
	int ia = 0;
	int iia = 0;
	if(i<=da && d<=10)
	{
	ia = da-i;
	System.out.println("You have " + ia + " points left.");
	}
	else if(i<=da && d>10)
	{
		ia = dda-i;
		System.out.println("You have " + ia + " points left.");
	}
	else if(i>da && d<=10)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Intelligence 1-10:");
		ii=sc.nextInt();
		iia = da-ii;
		System.out.println("You have " + iia + " points left.");
	}
	else if(i>da && d>10)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Intelligence 1-10:");
		ii=sc.nextInt();
		iia = dda-ii;
		System.out.println("You have " + iia + " points left.");
	}
	System.out.print("Constitution 1-10:");
	int c = sc.nextInt();
	int cc = 0;
	int ca = 0;
	int cca = 0;
	if(c<=ia && i<=da)
	{
	ca = ia-c;
	System.out.println("You have " + ca + " points left.");
	}
	else if(c<=ia && i>da)
	{
		ca = iia-c;
		System.out.println("You have " + ca + " points left.");
	}
	else if(c>ia && i<=da)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Constitution 1-10:");
		cc=sc.nextInt();
		cca = ia-cc;
		System.out.println("You have " + cca + " points left.");
	}
	else if(c>ia && i>da)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Intelligence 1-10:");
		cc=sc.nextInt();
		cca = iia-cc;
		System.out.println("You have " + cca + " points left.");
	}
	System.out.print("Charisma 1-10:");
	int ch = sc.nextInt();
	int cch = 0;
	int cha = 0;
	int ccha = 0;
	if(ch<=ca && c<=ia)
	{
	cha = ca-ch;
	System.out.println("You have " + cha + " points left.");
	}
	else if(ch<=ca && c>ia)
	{
		cha = cca-ch;
		System.out.println("You have " + cha + " points left.");
	}
	else if(ch>ca && c<=ia)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Charisma 1-10:");
		cch=sc.nextInt();
		ccha = cca-cch;
		System.out.println("You have " + ccha + " points left.");
	}
	else if(ch>ca && c>ia)
	{
		System.out.print("Please input a smaller number. ");
		System.out.print("Charisma 1-10:");
		cch=sc.nextInt();
		ccha = cca-cch;
		System.out.println("You have " + ccha + " points left.");
	}
	System.out.println("You are " + n + ", " + "the " + t + " of CVHS.");
	System.out.println("You're a " + ra + " with the following stats!");
	if(s<=10)
	{
		System.out.println(s);
	}
	else if(s>10)
	{
		System.out.println(ss);
	}
	if(d<=10)
	{
		System.out.println(d);
	}
	else if(d>10)
	{
		System.out.println(dd);
	}
	if(i<=da)
	{
		System.out.println(i);
	}
	else if(i>da)
	{
		System.out.println(ii);
	}
	if(c<=ia)
	{
		System.out.println(c);
	}
	else if(c>ia)
	{
		System.out.println(cc);
	}
	if(ch<=ca)
	{
		System.out.println(ch);
	}
	else if(ch>ca)
	{
		System.out.println(cch);
	}
	System.out.print("Good luck on your quest " + n + "!");
	}
}