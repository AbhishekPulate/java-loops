import java.util.Scanner;
class GoodPrimes
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number upto which we find good prime : ");
		int ub = sc.nextInt();
		int cnt = 0;
		for (int j = 2;j<=ub ;j++ )
		{
			boolean flag = true;
			for (int i = 2;i<j ;i++ )
			{
				if (j%i==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
				{
					// boolean flag1=true; //took unecessary flag1 variable
					int num = j;
					while (num>0)
					{
						int rem = num%10;
						if (rem==0||rem==1)
						{
							flag = false;
							break;
						}
						
							for (int k = 2;k<rem ;k++ )
							{
								if (rem%k==0)
								{
									flag = false;
									break;
								}
							}
						num /=10;
					}
					if (flag)
					{
						cnt++;
						System.out.println(j+" Is a good prime.");
					}
				}
		}
		System.out.println();
		System.out.println("There are " +cnt+ " good primes between 1 to "+ub);
		System.out.println();
	}
}




