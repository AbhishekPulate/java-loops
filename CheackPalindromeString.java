import java.util.Scanner;
class CheackPalindromeString
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.next();
		String dup = str;
		String rev = "";
		for (int i = 0 ; i<str.length() ; i++)
		{
			rev = rev + str.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev.equals(dup)?dup+" It's a palindrome":dup+" It's not a palindrome");
	}
}


