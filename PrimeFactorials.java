import java.util.Scanner;
class PrimeFactorials
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		for (int i = 1 ;i<=num ;i++ )
		{
			int cnt = 0;	
			if (num%i==0)
			{
				for (int j = 2 ; j<i ; j++ )
				{
					if (i%j==0)
					{
						cnt++;
						break;
					}
				}
				if (cnt==0)
				{
					System.out.println(i+" Is prime factor.");
				}
			}
			
		}
	}
}
		