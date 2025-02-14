class Series4
{
	public static void main(String [] args)
	{
		int num = 79;
		int prime = 29;
		
		for (int i = prime;i<=50 ;i++ )
		{
		
			boolean flag = true;
			for (int j = 2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				System.out.print(num+" ");
				num += i;
			}
		}
	}
}