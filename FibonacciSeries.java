import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int temp =0;
		for(int i = 1; i <= 10; i++)
		{

			System.out.print(num1+" ");
			temp = num1;
			num1 += num2;
			num2 = temp;
		}
	}
}
