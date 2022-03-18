import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class perfectString {

	public static void main(String[] args) {
		
		int count=0,flag=0;
		List<Character> chars = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		 for (char ch : input.toCharArray()) {
  
            chars.add(ch);
        }
		 sc.close(); 
		 for(int i=0;i<chars.size()-1;i++)
		 {
			 if(chars.get(i)=='P' && chars.get(i+1)=='R' || chars.get(i)=='R' && chars.get(i+1)=='P')
			 {
				 
				 count=count+1;
			 }
		
			 else
			 {
				 flag+=1;
				System.out.println("imperfect");
				 break;
			 }
		 }
			if(count%2!=0)
			{
				if(flag==0)
				{
					System.out.println("perfect");
				}
			}
			else
			{ 
				if(flag==0)
				System.out.println("perfect");
				else
					System.out.println("imperfect");
				
			}

		 }
	
	
	}
