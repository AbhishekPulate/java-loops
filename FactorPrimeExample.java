import java.util.Scanner;
class FactorPrimeExample
{
	public static void main(String [] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 2 ;i<num ;i++ )
		{
			if (num%i==0)
			{
				cnt++;
				System.out.print(i+"  ");
				Thread.sleep(1000);
			}
		}
		System.out.println();
		System.out.println(cnt==0?num+" Is a prime number":num+" Not a prime number");
	}
}