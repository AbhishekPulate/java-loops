class Series3
{
	public static void main(String [] args)
	{
		int num = 5;
		for (int i = 2;i<=6 ;i++ )
		{
			int pow = 1;
			int p = 3;
			for (int j = 1;j<=p ;j++ )
				pow *= i;
			System.out.print((pow+i)+" ");

		}
	}
}