import java.util.Scanner;
class SumFactorialEvenDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		while (num>0)
		{
			int fact = 1;
			int rem =num%10;
			if (rem%2==0)
			{
				for (int i = rem ; i>0 ; i-- )
				{
						fact *= i;
				}
			System.out.println(rem+" "+fact);
			sum += fact;
			}
			
			num/=10;
		}
		System.out.println("The sum of factorial of even digits is : "+sum);
	}
}
		