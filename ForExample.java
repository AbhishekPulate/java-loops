class ForExample
{
	public static void main(String [] args)
	{
		// PRINT 1 TO 10
		for (int i = 1 ; i<=10 ;i++ )
		{
			System.out.println(i);
		}
		System.out.println();
		// PRINT 'A' TO 'Z'
		for (char uc = 'A';uc<='Z' ;uc++ )
		{
			System.out.println(uc);
		}
		System.out.println();
		// PRINT 'z' TO 'a'
		for (char lc='z';lc>='a' ;lc-- )
		{
			System.out.println(lc);
		}
		System.out.println();
		// PRINT ASCII VALUE WITH THERE SYMBOL
		for (int i=0;i<=127 ;i++ )
		{
			System.out.println(i+":"+((char)i));
		}
	}
}
