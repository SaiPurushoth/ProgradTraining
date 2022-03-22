package junittesting;

import java.util.HashSet;
import java.util.Set;

public class Validip {
	public static boolean isValid(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.')
			{
				count++;
			}
		}
		if(count!=3)
		{
			return false;
		}
		
		Set<String> hs = new HashSet<String>();
		
		for(int i=0;i<256;i++)
		{
			hs.add(Integer.toString(i));
		}
		
		count=0;
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='.')
			{
				temp=temp+str.charAt(i);
			}
			else
			{
				if(hs.contains(temp))
				{
					count++;
				}
				temp="";
			}
		}
		
		if(temp.equals("0") || temp.endsWith("255"))
		{
			return false;
		}
		
		if(hs.contains(temp))
		{
			count++;
		}
		
		if(count==4)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
}