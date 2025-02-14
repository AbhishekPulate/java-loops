import java.util.Scanner;
class ColoumIndexToReference 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next().toUpperCase(); 

        int cnt = 0; 

        for(int i = 0; i < str.length(); i++) 
		{
            char ch = str.charAt(i);  
            int value = ch - 'A' + 1; 

            cnt = cnt * 26 + value;  
        }

        System.out.println(str + " : " + cnt); 
        
    }

}
