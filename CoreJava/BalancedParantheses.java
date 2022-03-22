import java.util.Scanner;
import java.util.*;





class BalancedParantheses{

	
	
	public static String Balanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
			{
				stack.push(str.charAt(i));
				
				
			}
			else
			{
				stack.pop();
			}
			
		}
	 
		 if(stack.empty())
         {
         	return "Already Balanced";
         }
         else
         {
         	while(!stack.empty())
         	{
         		char output=stack.pop();
               if(output=='(')
               {
             	  str=str+')';
	
                }
               if(output=='[')
               {
             	  str=str+']';
	
                }
               if(output=='{')
               {
             	  str=str+'}';
	
                }
         	}
         	return str;
         }
	}
		
		
		
	
	
	

	public static void main(String[] args) {
		 
		 
       
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the input");
			
			String str=sc.nextLine();
			
				
				System.out.println(Balanced(str));	
				
			
			
	}         

}
