import java.util.Scanner;
class PasswordProgram
{
	public static void main(String [] args)throws InterruptedException
	{
		Scanner  sc = new Scanner(System.in);
		int storedPin = 1234;
		int seconds=5000;
		outerloop:
		for (; ; )
		{
			int attempts = 3;
			do
			{
				System.out.print("Enter the password : ");
				int pass = sc.nextInt();
				if (pass==storedPin)
				{
					System.out.println("Phone Unlocked Success!.");
					break outerloop;
				}
				else 
				{
					System.out.println("Try again "+(attempts-1)+" attemps left");
				}
				attempts--;
			}
			while (attempts>=1);

			System.out.println();
			System.out.println("your phone locked for "+(seconds/1000)+" seconds");
			Thread.sleep(seconds);
			System.out.println();
			seconds *=2;

		}
	}
}