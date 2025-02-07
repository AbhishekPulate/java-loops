import java.util.Scanner;
class NumberExample1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		while (num>0)
		{
			int rem = num % 10;
			if (rem%2==0)
		{
				sum += rem ;
		}
		num /= 10;
		}
		System.out.println(sum);
	}
}
		