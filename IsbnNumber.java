import java.util.Scanner;
class IsbnNumber
{
	public static void main(String [] args)
	{
		System.out.print("Enter a number : ");
		long num = new Scanner(System.in).nextLong();
		int sum=0;
		for (long i = num,j=1;i>0 ;i/=10,j++ )
		{
			long rem = i%10;
			sum +=(rem*j);
		}
		if (sum%11==0)
		{
			System.out.println(num+" Is a valid ISBN Number.");
		}
		else
		{
			System.out.println(num+" Is not a valid Number.");
		}
	}
}