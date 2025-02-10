import java.util.Scanner;
class TempCoverter
{
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("			WELCOME");
			System.out.println();
			System.out.println(" # The list of temperatures is # ");
			System.out.println("	1.Celcius.");
			System.out.println("	2.Farenheit.");
			System.out.println("	3.Kelvin.");
			System.out.println("	4.Rankine.");
			System.out.println("	5.Exit");
			System.out.println();
			System.out.print("Select option to enter temperature : ");
			int opt = sc.nextInt();
			float temp = 0f;
			switch (opt)
			{
			case 1: 
				{
					System.out.println("Enter temperature in Celcius ");
					float temp1 = sc.nextFloat();
					temp = temp1;
					break;
				}
			case 2: 
				{
					System.out.println("Enter temperature in Farenheit ");
					float temp1 = sc.nextFloat();
					temp = temp1;
					break;
				}
			case 3: 
				{
					System.out.println("Enter temperature in Kelvin ");
					float temp1 = sc.nextFloat();
					temp = temp1;
					break;
				}
			case 4: 
				{
					System.out.println("Enter temperature in Rankine ");
					float temp1 = sc.nextFloat();
					temp = temp1;
					break;
				}
			case 5: 
				{
					System.out.println();
					System.out.println("Thank you for using the app.");
					System.exit(0);
				}
			default:
				System.out.println("INVALID INPUT");
			}
			System.out.println();
			System.out.println(" # The list of temperatures to convert into  # ");
			System.out.println("	1.Celcius.");
			System.out.println("	2.Farenheit.");
			System.out.println("	3.Kelvin.");
			System.out.println("	4.Rankine.");
			System.out.println();
			System.out.print("Select option to convert temperature : ");
			int opt1 = sc.nextInt();
			if (opt1!=opt)
			{
				switch (opt1)
					{
					case 1:
						{
							if (opt==2)
							{
								float convTemp = (temp - 32) / 1.8f;
								System.out.println(temp+" Farenheit to Celcius is "+convTemp);
								break;
							}
							if (opt==3)
							{
								float convTemp = temp - 273.15f;
								System.out.println(temp+" Kelvin to Celcius is "+convTemp);
								break;
							}
							if (opt==4)
							{
								float convTemp = temp * 5/9f - 273.15f;
								System.out.println(temp+" Rankine to Celcius is "+convTemp);
								break;
							}
						}
					case 2:
						{
							if (opt==1)
							{
								float convTemp = temp * 9/5 + 32f;
								System.out.println(temp+" Celcius to Farenheit is "+convTemp);
								break;
							}
							if (opt==3)
							{
								float convTemp = temp * 9/5f - 459.67f;
								System.out.println(temp+" Kelvin to Farenheit is "+convTemp);
								break;
							}
							if (opt==4)
							{
								float convTemp = temp - 459.67f;
								System.out.println(temp+" Rankine to Farenheit is "+convTemp);
								break;
							}
						}
					case 3:
						{
							if (opt==1)
							{
								float convTemp = temp + 273.15f;
								System.out.println(temp+" Celcius to Kelvin is "+convTemp);
								break;
							}
							if (opt==2)
							{
								float convTemp = (temp + 459.67f)*5/9f;
								System.out.println(temp+" Farenheit to Kelvin is "+convTemp);
								break;
							}
							if (opt==4)
							{
								float convTemp = temp * 5/9f;
								System.out.println(temp+" Rankine to Kelvin is "+convTemp);
								break;
							}
						}
					case 4:
						{
							if (opt==1)
							{
								float convTemp = (temp + 273.15f)*9/5f;
								System.out.println(temp+" Celcius to Rankine is "+convTemp);
								break;
							}
							if (opt==2)
							{
								float convTemp = temp + 459.67f;
								System.out.println(temp+" Kelvin to Rankine is "+convTemp);
								break;
							}
							if (opt==3)
							{
								float convTemp = temp * 9/5f;
								System.out.println(temp+" Farenheit to Rankine is "+convTemp);
								break;
							}
						}
					default:
							System.out.println("INVALID INPUT");
					}
			}
			else
				System.out.println(temp+"="+temp);
		}
	}
}