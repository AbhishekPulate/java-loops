import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0,lent = 0;
		int dup = num;
		 for (int i = num;i>0 ;i/=10 )
			lent++;
		 while (num>0)
		 {
			 int rem = num%10;
			 int pow = 1;
			 for (int j = 1;j<=lent ;j++ )
			 {
				 pow *=rem;
			 }
			 sum +=pow;
			 num /=10;
		 }
		 System.out.println(dup==sum?dup+" Is the armstrong Number":dup+" Not an armstrong Number");
	}
}
		 