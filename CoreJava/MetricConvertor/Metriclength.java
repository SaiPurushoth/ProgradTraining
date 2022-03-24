package MetricConvertor;

public class Metriclength {
	
	public static String convertToCentimeter(String input)
	{
		String[] units = input.split(" ");
		Double number=Double.parseDouble(units[0]);
		if(units[1].equals("cm"))
		{
			return number+" cm";
		}
		if(units[1].equals("m"))
		{
			return (100*number)+" cm";
		}
		else
		{
			return (100000*number)+" cm";
		}
	}
	
	public static String convertToMeter(String input)
	{
		String[] units = input.split(" ");
		Double number=Double.parseDouble(units[0]);
		if(units[1].equals("cm"))
		{
			return ((double)number/100)+" m";
		}
		if(units[1].equals("m"))
		{
			return number+" m";
		}
		else
		{
			return (1000*number)+" m";
		}
	}
	
	public static String convertToKilometer(String input)
	{
		String[] units = input.split(" ");
		Double number=Double.parseDouble(units[0]);
		if(units[1].equals("cm"))
		{
			return ((double)number/100000)+" km";
		}
		if(units[1].equals("m"))
		{
			return ((double)number/1000)+" km";
		}
		else
		{
			return number+" km";
		}
	}    
    public static String totalDistance(String input_one,String input_two)
	{
		String[] units_one = input_one.split(" ");
		String[] units_two = input_two.split(" ");
		Double number_one=Double.parseDouble(units_one[0]);
		Double number_two=Double.parseDouble(units_two[0]);
		
		if(units_one[1].equals("cm")  && units_two[1].contentEquals("cm"))
		{
			return (number_one+number_two)+" cm";
		}
		if(units_one[1].equals("m")  && units_two[1].contentEquals("cm") || units_one[1].equals("cm")  && units_two[1].contentEquals("m") )
		{
			if(units_one[1].equals("m"))
			{
			String mtocm = 	convertToCentimeter(input_one);
			units_one = mtocm.split(" ");
			number_one=Double.parseDouble(units_one[0]);
			return (number_one+number_two)+" cm";
			}
			else
			{
				String mtocm = 	convertToCentimeter(input_two);
				units_two = mtocm.split(" ");
				number_two=Double.parseDouble(units_two[0]);
				return (number_one+number_two)+" cm";
				
			}
		}

		else
		{
			if(units_one[1].equals("km"))
			{
			String mtokm = 	convertToCentimeter(input_one);
			units_one = mtokm.split(" ");
			number_one=Double.parseDouble(units_one[0]);
			return (number_one+number_two)+" cm";
			}
			else
			{
				String mtokm = 	convertToCentimeter(input_two);
				units_two = mtokm.split(" ");
				number_two=Double.parseDouble(units_two[0]);
				return (number_one+number_two)+" cm";
				
			}
			
		}
	}
	
	public static String remainingDistance(String input_one,String input_two)
	{
		String[] units_one = input_one.split(" ");
		String[] units_two = input_two.split(" ");
	    Double number_one=Double.parseDouble(units_one[0]);
		Double number_two=Double.parseDouble(units_two[0]);
		
		if(units_one[1].equals("cm")  && units_two[1].contentEquals("cm"))
		{
			if(number_one>number_two)
			{
			return (number_one-number_two)+" cm";
			}
			else
			{
				return (number_two-number_one)+" cm";
			}
		}
		if(units_one[1].equals("m")  && units_two[1].contentEquals("cm") || units_one[1].equals("cm")  && units_two[1].contentEquals("m") )
		{
			if(units_one[1].equals("m"))
			{
			String mtocm = 	convertToCentimeter(input_one);
			units_one = mtocm.split(" ");
			number_one=Double.parseDouble(units_one[0]);
			
			if(number_one>number_two)
			{
			return (number_one-number_two)+" cm";
			}
			else
			{
				return (number_two-number_one)+" cm";
			}
			}
			else
			{
				String mtocm = 	convertToCentimeter(input_two);
				units_two = mtocm.split(" ");
				number_two=Double.parseDouble(units_two[0]);
				if(number_one>number_two)
				{
				return (number_one-number_two)+" cm";
				}
				else
				{
					return (number_two-number_one)+" cm";
				}
				
			}
		}

		else
		{
			if(units_one[1].equals("km"))
			{
			String mtokm = 	convertToCentimeter(input_one);
			units_one = mtokm.split(" ");
			number_one=Double.parseDouble(units_one[0]);
			if(number_one>number_two)
			{
			return (number_one-number_two)+" cm";
			}
			else
			{
				return (number_two-number_one)+" cm";
			}
			}
			else
			{
				String mtokm = 	convertToCentimeter(input_two);
				units_two = mtokm.split(" ");
				number_two=Double.parseDouble(units_two[0]);
				if(number_one>number_two)
				{
				return (number_one-number_two)+" cm";
				}
				else
				{
					return (number_two-number_one)+" cm";
				}
				
			}
			
		}				
		
	}

}
