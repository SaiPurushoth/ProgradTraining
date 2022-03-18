import java.util.Arrays;
import java.util.Scanner;

public class Productofelements {
	public static void main(String[] args) {

        int arr[] = {7, 3, 6, 4, 2};
        Arrays.sort(arr);     
        
        

        int p1=0;
        int p2=arr.length-1;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
        int k=Integer.parseInt(sc.nextLine());
        
        int count=0;
        while(p1<p2)
        {
        	if((arr[p1]*arr[p2])==k)
        	{
        		count++;
        		if(p1<arr.length-1)
        		{
        			p1++;
        		}
               if(p2>0)
               {
            	   p2--;
               }
        		
        	}
        	else if((arr[p1]*arr[p2])<k)
        	{

        		p1++;
        	}
        	else
        	{

        		p2--;
        	}
        		
        }

        
		System.out.println(count);
        
		
	}

}
