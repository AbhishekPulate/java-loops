import java.util.Scanner;
class ConvertStringOddEven
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int dup = num;
		int cnt = 0;
		while (num>0)
		{
			cnt++;
			num /=10;
		}
		String newNum = "";
		if (cnt%2==0)
		{
			for (int i=dup;i>0 ;i /=10 )
			{
				int rem = i%10;
				if (rem%2!=0)
				{
					rem +=1;
				}
				newNum = rem + newNum;
			}
			System.out.println(newNum);
		}
		else if (cnt%2!=0)
		{
			for (int i=dup ; i>0 ; i/=10 )
			{
				int rem = i%10;
				if (rem%2==0)
				{
					rem +=1;
				}
				newNum = rem + newNum;
			}
			System.out.println(newNum);
		}		
	}
}
