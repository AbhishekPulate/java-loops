import java.util.Scanner;
class UserRangePrime
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the lower limit of the range : ");
		int lb = sc.nextInt();
		System.out.print("enter the upper limit of the range : ");
		int ub = sc.nextInt();
		System.out.println();

		for (int j = lb;j<=ub ;j++ )
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
					System.out.print(j+" ");
				}
		}
		System.out.println();
	}
}
        