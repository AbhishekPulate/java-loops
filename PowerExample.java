import java.util.Scanner;
class PowerExample
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int op = 1;
		System.out.print("Enter the power : ");
		int power = sc.nextInt();
		for (int i =1 ; i<=power; i++ )
		{
			op *=num;
		}
		System.out.println(num+"^"+power+" = "+op);
	}
}
