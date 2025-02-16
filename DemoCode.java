import java.util.Scanner;
class  DemoCode
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the string : ");
		String str = new Scanner(System.in).next();
		String dup = str;
		String upd = "";
		int len = str.length();
		int cnt = 0;
		String cnt2 = "";
		int ch1 = 0;
		for (int i = 0;i<len ;i++ )
		{
			if (!(upd.contains(Character.toString(str.charAt(i))))) 
			{
				upd +=str.charAt(i);
			}
		}
		for (int i = 0;i<upd.length() ;i++ )
		{
			int cnt1 = 0;
			char ch = upd.charAt(i);
			for (int j = 0;j<len ;j++ )
			{
				if (ch!=str.charAt(j))
				{
					cnt1++;
				}
			}
			cnt2 += cnt1;
		}

		cnt = Character.getNumericValue(cnt2.charAt(0));

		for (int k = 1;k<cnt2.length() ;k++ )
			{
				ch1 = Character.getNumericValue(cnt2.charAt(k));
				if (ch1<cnt)
				{
					cnt = ch1;
				}
			}

		System.out.println("Minimum swaps needed is "+cnt);
	}
}
