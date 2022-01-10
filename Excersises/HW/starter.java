import java.util.Scanner;
class starter{
	
	public static void checkPrime(int a, int b){
		int x = a;
		int y = b;
		b=13;
		while(true)
		{
			if(b%a != 0 && b >=2)
			{
				System.out.println("This is a prime number.");
				break;
			}
			else if(b >= 2 && a == 0)
			{
				System.out.println("This is not a prime number.");
				break;
			}
			b = a/b-1;
		}
		return;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int a = sc.nextInt();
	}
}