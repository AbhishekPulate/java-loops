import java.util.Scanner;
class EyCode
{
	public static void main(String [] args)
	{
		System.out.print("Enter a string : ");
		String str = new Scanner(System.in).next();
	 /*
		System.out.println(str.contains("1111111")||str.contains("0000000")?"YES":"NOT");	*/
		for (int i = 0;i<str.length() ;i++ )
		{
			if (str.charAt(i)=='1')
			{
				boolean flag = true;
				for (int j = i;j<str.length() ;j++ )
				{
					if (str.charAt(j)=='0')
					{
						flag = false;
						break;
					}
				}
				if (flag)
				{
					System.out.println("YES");
					break;
				}
			}
		}
		System.out.println("NOT");
	}
}