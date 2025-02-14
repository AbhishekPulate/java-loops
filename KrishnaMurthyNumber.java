class KrishnaMurthyNumber
{
	public static void main(String [] args)
	{
		int num= 145;
		int dup = num;
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			for (int i = 1;i<=rem ;i++ )
			{
				fact *=i;
			}
			sum += fact;
			num /=10;
		}
		System.out.println(sum==dup?dup+" Is a KrishnaMurthy Number":dup+" Not a krishna murthy Number");
	}
}