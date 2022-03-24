package MetricConvertor;

public class Metricvolume {
	
	public static String convertToGrams(String input)
	{
		String[] units = input.split(" ");
		Double number=Double.parseDouble(units[0]);
		if(units[1].equals("g"))
		{
			return number+" g";
		}
		else
		{
			return ((double)1000*number)+" g";
		}
	}
	
	public static String convertToKilogram(String input)
	{
		String[] units = input.split(" ");
		Double number=Double.parseDouble(units[0]);
		
		if(units[1].equals("g"))
		{
			return ((double)number/1000)+" kg";
		}
		else
		{
			return number+" kg";
		}
	}

	public static String totalVolume(String input_one,String input_two)
	{
		String[] units_one = input_one.split(" ");
		String[] units_two = input_two.split(" ");
		Double number_one=Double.parseDouble(units_one[0]);
		Double number_two=Double.parseDouble(units_two[0]);
		
		if(units_one[1].equals("g")  && units_two[1].contentEquals("g"))
		{
			return (number_one+number_two)+" g";
		}

		else
		{
			if(units_one[1].equals("kg"))
			{
			String kgtog = 	convertToGrams(input_one);
			units_one = kgtog.split(" ");
			number_one=Double.parseDouble(units_one[0]);
			return (number_one+number_two)+" g";
			}
			else
			{
				String kgtog = 	convertToGrams(input_two);
				units_two = kgtog.split(" ");
				number_two=Double.parseDouble(units_two[0]);
				return (number_one+number_two)+" g";
				
			}
			
		}				
		
	}	
	
	public static String remainingVolume(String input_one,String input_two)
	{
		String[] units_one = input_one.split(" ");
		String[] units_two = input_two.split(" ");
		double number_one=Double.parseDouble(units_one[0]);
		double number_two=Double.parseDouble(units_two[0]);
		
		if(units_one[1].equals("g")  && units_two[1].contentEquals("g"))
		{
			if(number_one>number_two)
			{
			return (number_one-number_two)+" g";
			}
			else
			{
				return (number_two-number_one)+" g";
			}
		}

		else
		{
			if(units_one[1].equals("kg"))
			{
			String kgtog = 	convertToGrams(input_one);
			units_one = kgtog.split(" ");
			number_one=Double.parseDouble(units_one[0]);
			if(number_one>number_two)
			{
			return (number_one-number_two)+" g";
			}
			else
			{
				return (number_two-number_one)+" g";
			}
			}
			else
			{
				String kgtog = 	convertToGrams(input_two);
				units_two = kgtog.split(" ");
				number_two=Double.parseDouble(units_two[0]);
				if(number_one>number_two)
				{
				return (number_one-number_two)+" g";
				}
				else
				{
					return (number_two-number_one)+" g";
				}
				
			}
			
		}				
		
	}
	
	

}
