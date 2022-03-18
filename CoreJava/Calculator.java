 import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
		int a=sc.nextInt();
		char c = sc. next(). charAt(0);
		int b=sc.nextInt();
		
		
		if(c=='+')
		{
			int d =a+b;
			System.out.println(d);
		} 
		else if(c=='-')
		{
			int d =a-b;
			System.out.println(d);

		}
		else if(c=='*')
		{
			int d =a*b;
			System.out.println(d);

		}
		else if(c=='/')
		{
			int d =a/b;
			System.out.println(d);

		}
		else
		{
			System.out.println("operation not included");
		}
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("you should not divide by 0");
			System.out.println("invalid output");
		}
		catch(NumberFormatException e){
			  System.out.println("Number format exception occurred");
		}
		catch(InputMismatchException e){
			  System.out.println("invalid input datatypes");
			  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
			System.out.println("The End");
		}

	}

}
