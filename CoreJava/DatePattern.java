import java.util.*;
import java.util.Scanner;
public class DatePattern {
	
	public static HashSet<Integer> StringtoInteger(String para)
	{
		String str="";
		String[] Array = para.split(" ");
        for (int i = 0; i < Array.length; i++) {	
        if(Array[i].contains("-"))
        {
        	str=str+=Array[i]+" ";
        }
        }
		
        para = str.replaceAll("\\D", " ");
        para = para.trim();
        String[] splitArray = para.split(" ");
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < splitArray.length; i++) {
        	String temp=splitArray[i];
        	int length=temp.length();
        	if(length==4)
        	{
            numbers.add(Integer.parseInt(splitArray[i]));
        	}
        }
        return numbers;	
		
	}
	public static void main(String[] args) {
		HashSet<Integer>output;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
        String str=sc.nextLine();
        output=StringtoInteger(str);
        int number=output.size();
        System.out.println(number);
	}
} 
