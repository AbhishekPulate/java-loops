import java.util.Scanner;
class FrequencyGenrator
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		long num = sc.nextLong();
		System.out.println(num);
		long max = 0;
		long maxCount = 0;
		long min = 0;
		long minCount = 9;
		for (long i = 0;i<=9 ;i++ )
		{
			int cnt = 0;
			for (long j = num ; j>0 ;j /=10 )
			{
				long rem = j%10;
				if (i==rem)
				{
					cnt++;
				}
			}
			if (cnt!=0)
			{
				System.out.println(i+" : "+cnt);
				if (maxCount<cnt)
				{
					maxCount = cnt;
					max = i;
				}
				if (minCount>cnt)
				{
					minCount = cnt;
					min = i;
				}
			}
		}
		System.out.println();
		System.out.println("Highest repeting number is : "+max);
		System.out.println();
		System.out.println("Lowest repeting number is : "+min);
	}
}