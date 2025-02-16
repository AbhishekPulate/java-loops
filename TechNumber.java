class TechNumber 
{
	public static void main(String[] args) 
	{
		for (int k = 1;k<=1000000 ;k++ )
		{
			int num = k,len = 0 , div = 1;
			for (int i = num; i>0;i/=10 )
				len++;
			if (len%2==0)
			{
				for (int i = 1;i<=len/2 ;i++ )
				{
					div*=10;
				}
				int sum = (num/div)+(num%div);
				int sqr = sum*sum;
				if (sqr==num)
						{
							System.out.println( num+" is a TECH Number");
						}
			}
		}
		
			
	}
}
