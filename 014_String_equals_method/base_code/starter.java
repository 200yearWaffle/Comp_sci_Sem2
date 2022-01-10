import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	String jeeb = ("Whould you like to be a Wizard, Warrier, or Rogue?");
	System.out.println(jeeb);
	String a = sc.nextLine();
	String b = ("Wizard");
	String c = ("Warrior");
	String d = ("Rogue");
	String jeef = ("You've chosen the Wizard! Excelsior!");
	String jeep = ("You've chosen the Warrior! For honor!");
	String jeb = ("You've chosen the Rogue! How cunning!");
	String jebb = ("You've decided not to choose a role. Please rerun the program.");
if(a.equals(b) || a.equals(b2))
	{
		System.out.println(jeef);
	}
	else if(a.equals(c) || a.equals(c2))
	{
		System.out.println(jeep);
	}
	else if(a.equals(d) || a.equals(d2))
	{
		System.out.println(jeb);
	}
	else if(!a.equals(b) && !a.equals(c) && !a.equals(d))
	{
		System.out.println(jebb);
	}
	}
}
