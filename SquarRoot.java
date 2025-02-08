import java.util.Scanner;
class SquarRoot
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for (int i = 1;i<=num ;i++ )
		{
			if ((i*i)==num)
			{
				System.out.println("The square root of number : "+num+" is : "+i);
				break;
			}
			else if ((i*i)>num)
			{
				System.out.println("The number : "+num+" does not have a perfect square root");	
				break;
			}
		}		
	}
}