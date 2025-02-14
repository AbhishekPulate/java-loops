// 144  2197  196  3375 256

import java.util.Scanner;
class Series1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for (int i = 1;i<=5 ;i++,num++ )
		{
			int pow = 1;
			int p = num %2==0 ? 2: 3;
			for (int j = 1;j<=p ;j++ )
				pow *= num;
			System.out.print(pow+" ");

		}
	}
}