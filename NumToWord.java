import java.util.Scanner;
class NumToWord
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		String str = "";
		while (num>0)
		{
			int rem = num%10;
			switch (rem)
			{
			case 0:str = "ZERO "+str;break;
			case 1:str = "ONE "+str;break;
			case 2:str = "TWO "+str;break;
			case 3:str = "THREE "+str;break;
			case 4:str = "FOUR "+str;break;
			case 5:str = "FIVE "+str;break;
			case 6:str = "SIX "+str;break;
			case 7:str = "SEVEN "+str;break;
			case 8:str = "EIGHT "+str;break;
			case 9:str = "NINE "+str;break;
			}
			num = num/10;
		}
		System.out.println(str);
	}
}