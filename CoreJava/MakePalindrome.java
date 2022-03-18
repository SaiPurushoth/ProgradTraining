import java.util.Scanner;

public class MakePalindrome {
	
public static boolean PalindromeCheck(String original)
{
	String reverse="";
    int length = original.length();   
    for ( int i = length - 1; i >= 0; i-- )  
       reverse = reverse + original.charAt(i);  
    if (original.equals(reverse))  
       return true;  
    else  
       return false;
 }  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
        String str=sc.nextLine();
        if(PalindromeCheck(str))
        {
    		System.out.println("already a palindrome");	
        }
        else
        {
            String next = "";
            int i = 0;
            String output=str + next;
            while(! PalindromeCheck(output)){
                next =  str.charAt(i)+next;
                output=str + next;
                i++;
            }
            
    		System.out.println(output);     
        	
        }
	}

}
