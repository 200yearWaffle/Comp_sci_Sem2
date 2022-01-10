import java.util.Scanner;
class starter {
	
	public static void multDiv3(int a, int b){
		int x = a;
		int y = b;
		int product = x * y;
		if(product%3 == 0)
		{
			System.out.println("Your number is divisable by 3");
			return;
		}
		else{
			System.out.println("Your number is not divisable by 3");
			return;
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int a = sc.nextInt();
		System.out.println("Input another integer.");
		int b = sc.nextInt();
		multDiv3(a,b);
	}
}