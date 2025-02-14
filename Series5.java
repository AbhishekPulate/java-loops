class Series5
{
	public static void main(String [] args)
	{
		int a = 1;

		for (int num = 2;num<=7 ;num++ )
		{
			int fact = num;
			for (int i = 1;i<num ;i++ )
			{
				fact *=i;
				
			}
			System.out.print(a+" ");
			a +=fact;
		}
	}
}