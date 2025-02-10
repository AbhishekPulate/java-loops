import java.util.Scanner;
class ConvertStringOddEven
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the number : ");
		int len = sc.nextInt();
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String even = "";
		String odd = "";
		if (len%2==0)
		{
			for (int i=num;i>0 ;i /=10 )
			{
				int rem = i%10;
				if (rem%2!=0)
				{
					rem +=1;
				}
				even = rem + even;
			}
			System.out.println(even);
		}
		if (len%2!=0)
		{
			for (int i=num ; i>0 ; i/=10 )
			{
				int rem = i%10;
				if (rem%2==0)
				{
					rem +=1;
				}
				odd = rem + odd;
			}
			System.out.println(odd);
		}		
	}
}
