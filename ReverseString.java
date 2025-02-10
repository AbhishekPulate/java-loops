import java.util.Scanner;
class ReverseString
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		String rev = "";
		for (int i = 0;i<str.length() ;i++ )
		{
			rev = str.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
