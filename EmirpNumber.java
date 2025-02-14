import java.util.Scanner;
class EmirpNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int rev = 0;
		for (int i = 2;i<num ;i++ )
		{
			if (num%i==0)
			{
				System.out.println(dup+" Is not a prime number.");
				break;
			}
			else
			{
				for (int j = num ; j>0 ; j /=10 )
				{
					int rem = j%10;
					rev = rev*10 + rem;

				}
				break;
			}
		}
		for (int i = 2;i<rev ;i++ )
		{
			boolean flag = true;
			if (rev%i==0)
			{
				flag = false;
				System.out.println(dup+" Is not an emirp number.");
				break;
			}
			if (flag)
			{
				System.out.println(dup+" Is an emirp number.");
				break;

			}

		}
	}
}