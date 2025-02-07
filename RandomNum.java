import java.util.Scanner;
class RandomNum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int randomNum = 0;
		
		/*for ( int i = 1;i<=10 ;i++ )
		{
			int num = (int)(Math.random()*10);
			if(num>=1&&num<=3)
			{
				System.out.println(num+" ");
				continue;
			}
			i--;
		}      */
		
		//Another way to write for loop.this loop will run for infinite iterations so we give break statement in if statement to end loop if condition is true.
		
		for ( ; ;)
		{
			//math.random() always gen a doble value from 0.0 some
			// we multi the same value by 10
			//and them teh to fer an interfer we used type casting

			int num = (int)(Math.random()*10);
			if (num>= 1 && num<=3) // checked if the digit is bet 1 to 3
			{
				randomNum = num; // then only store
				break; // if digit found bet 1 to 3 then terminate the loop
			}	
		}
		//Whatever 
		String codeOpt = null;
		if (randomNum == 1)
		{
			codeOpt = "STONE";	
		}
		else if (randomNum == 2)
		{
			codeOpt = "PAPER";	
		}
		else if (randomNum == 3)
		{
			codeOpt = "SCISSOR";	
		}	

		//second part

		System.out.println();
		System.out.println("    Welcome");
		System.out.println();
		System.out.println("1. STONE \n2. PAPER \n3. SCISSOR");
		System.out.println();
		System.out.print("Enter Option : ");
		int opt = sc.nextInt();

		String userOpt = null;
		if (opt == 1)
		{
			userOpt = "STONE";	
		}
		else if (opt == 2)
		{
			userOpt = "PAPER";	
		}
		else if (opt == 3)
		{
			userOpt = "SCISSOR";	
		}
		else 
		{
			System.out.println("Invalid Input.");
			return;//Terminate the executions
		} 
		System.out.println("User :- "+userOpt + " Computer :- "+codeOpt);
		if ((opt==1 && randomNum==3)||(opt==2 && randomNum==1)||(opt==3 && randomNum==2)) {
			System.out.println("USER WINS");
		}
		else if ((opt==1 && randomNum==2)||(opt==2 && randomNum==3)||(opt==3 && randomNum==1)) {
			System.out.println("COMPUTER WINS");
		}
		else{
			System.out.println("DRAW");
		}

	}
}

	

