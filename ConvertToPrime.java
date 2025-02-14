import java.util.Scanner;
class  ConvertToPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int dm = 2;

		while (dm<num/2)
		{
			if (num%dm==0)
			{
				num +=1;
				dm=2;
			}
			dm++;
		}


		/*
		for (int i = 2;i<num ;i++ )
		{
			
			if (num%i==0)
			{
				num +=1;
			}
		
		}
		*/
		System.out.println("Prime number is : "+num);	
	}
}
