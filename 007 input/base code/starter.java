import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		String question1= new String ("What is your first name?");
		System.out.println(question1);
		String answer1 = sc.nextLine ();
		String question2 = new String ("What is your age?");
		System.out.println(question2);
		int answer2 = sc.nextInt ();
		String question3 = new String ("What is your birth month?(1-12)");
		System.out.println(question3);
		int answer3 = sc.nextInt ();
		String question4 = new String ("What is your birth day(1-31)?");
		System.out.println(question4);
		int answer4 = sc.nextInt ();
		String question5 = new String ("What is your birth year?");
		System.out.println(question5);
		int answer5 = sc.nextInt ();
		String question6 = new String ("How much is a buck fifty?");
		System.out.println(question6);
		double answer6 = sc.nextDouble ();
		System.out.print("Your name is ");
		System.out.print(answer1);
		System.out.print(" and you were born on ");
		System.out.print(answer3);
		System.out.print("/");
		System.out.print(answer4);
		System.out.print("/");
		System.out.print(answer5);
		System.out.println(".");
		System.out.print("You are ");
		System.out.print(answer2);
		System.out.println(" years old!!!");
		System.out.print("You have $");
		System.out.print(answer6);
		System.out.print(" in your wallet.");
	}
}
