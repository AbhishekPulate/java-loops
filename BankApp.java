import java.util.Scanner;
class BankApp
{
	public static void main(String [] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		String userName = null;
		String password = null;
		String address = null;
		double amount = 0d;
		long contact = 0l;
		int pin = 0;
		for (; ; )
		{
			System.out.println();
			System.out.println("                    WELOCOME");
			System.out.println("                LAXMI CHIT FUND");
			System.out.println();
			System.out.println("Select an option: ");
			System.out.println("1.LOGIN.");
			System.out.println("2.CREATE NEW ACCOUNT.");
			System.out.println();
			System.out.print("Enter you option : ");
			int opt = sc.nextInt();
			sc.nextLine();
			if (opt==1)
			{
				if (userName==null||password==null)  
				{
					System.out.println("Create an account first");
				}
			}
			switch (opt)
			{
				case 1:
					{
						
						for (int i = 3 ; i>=1 ; i-- )
						{
							System.out.print("Enter username : ");
							String userName1 = sc.nextLine(); 
							System.out.print("Enter password : ");
							String password1 = sc.nextLine();
							if (userName1.equals(userName)&&password1.equals(password))
							{
								System.out.println();
								System.out.println("WELCOME "+userName);
								System.out.println();
								Home :
								for (; ; )
								{
								System.out.println("select an option : ");
								System.out.println("1.DEPOSIT");
								System.out.println("2.WITHDRAW");
								System.out.println("3.BALANCE");
								System.out.println("4.MINI STATEMENT");
								System.out.println("5.LOGOUT");
								System.out.print("Enter the option : ");
								int opt2 = sc.nextInt();

								switch (opt2)
								{
									case 1:
										{
											System.out.println("DEPOSIT");
											System.out.print("Enter amount to deposit : ");
											double deposit = sc.nextDouble();
											amount += deposit;
											System.out.println("Amount deposited succefully");
											System.out.println();

											break;
										}
									case 2:
										{
											System.out.println("WITHDRAW");
											System.out.print("Enter amount to withdraw : ");
											double withdraw = sc.nextDouble();
											System.out.println("Enter the pin.");
											int pin1 = sc.nextInt();
											System.out.println();
											if (pin1==pin)
											{
												if (withdraw<=amount)
												{
													amount -= withdraw;
												}
												else
												{
													System.out.println("insuffiecient funds");
													System.out.println();
												}

											}
											else
											{
												System.out.println("INVALID PIN");
												System.out.println();
											}
											
											break;
										}
									case 3:
										{
											System.out.println("CHEACK BALANCE.");
											System.out.println();
											System.out.println("Enter your pin.");
											int pin2 = sc.nextInt();
											System.out.println();
											for (int j=3;j>=1 ;j-- )
											{
												if (pin2==pin)
												{
													System.out.println("Your balance is : "+amount+" rs");
													System.out.println();
													continue Home;
												}
												else
												{
													System.out.println("INVALID PIN,You have "+(j-1)+" chances left");
													System.out.println();
												}
												
											}
											System.out.println();
											System.out.println("your account has been blocked for 24 hours.");
											System.out.println();
											System.exit(0);

											break;
										}
									case 4:
										{
										System.out.println();
										System.out.println("MINI STATEMENT");
										System.out.println();
										break;
										}
									case 5:
										{
										System.out.println();
										System.out.println("Thank you for using our app.");
										System.out.println();
										System.exit(0);
										break;
										}
											
									}
								}
								
							}
							
							else
							{
								System.out.println();
								System.out.println("Invalid Credentials. you have "+(i-1)+" chances left");
								System.out.println();
								continue;
							}

							
						}
						System.out.println();
						System.out.println("Thank you and never visit again.");
						System.out.println();
						System.exit(0);
						
						break;

					}	
				case 2:
					{
						System.out.println();
						System.out.print("Enter username : ");
						 userName = sc.nextLine();
						System.out.print("Enter passwword : ");
						 password = sc.nextLine();
						System.out.print("Enter address : ");
						 address = sc.nextLine();
						System.out.print("Enter amount : ");
						 amount = sc.nextDouble();
						System.out.print("Enter contact : ");
						 contact = sc.nextLong();
						System.out.print("Enter PIN : ");
						 pin = sc.nextInt();
						System.out.println();
						Thread.sleep(800);
						System.out.println("Account created successfully");
						Thread.sleep(800);
						System.out.println();

						 break;
					}
			}

			
		}
	}
}
