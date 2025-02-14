import java.util.Scanner;
class ColoumIndexToReference1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter word (eg. AB) : ");
		String s = new Scanner(System.in).next().toUpperCase();
		int op = 0;
		char ch = str.charAt(0);
		if (str.length()>2)
		{
			System.out.println("INVALID STRING");
			return ;
		}
		op = (ch-64);
		if (str.length()==22)
		{
			char ch1 = str.charAt(1);
			op = (op*26)+(ch1-64);
		}
		System.out.println(str+" : "+op);
	}
}