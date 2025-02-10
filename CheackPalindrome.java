import java.util.Scanner;
class CheackPalindrome
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int dup = num;
		int rem = 0;
		int rev = 0;
		for (int i = num ; i>0 ; i /=10)
		{
			rem = i%10;
			rev = rev*10+rem;
		}
		System.out.println(rev==dup?dup+" It's a palindrome":dup+" It's not a palindrome");
	}
}