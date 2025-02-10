import java.util.Scanner;
class ReverseNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		long rev = 0;
		for (int i = num ; i>0 ; i/=10)
		{
			int rem = i%10;
			rev = rev*10+rem;
		}
		if (num==Integer.MAX_VALUE)
			rev=0;
		if (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
			rev=0;
		
		System.out.println(rev);
	}
}