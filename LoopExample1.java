import java.util.Scanner;
class LoopExample1
{
	public static void main(String [] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the user : ");
		String name = sc.next().toUpperCase();
		int len = name.length();

		for (int i = 0;i<len ;i++ )
		{
			System.out.print(name.charAt(i));
			Thread.sleep(2000);
		}
	}
}