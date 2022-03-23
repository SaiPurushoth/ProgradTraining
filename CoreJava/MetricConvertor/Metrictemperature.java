package MetricConvertor;

public class Metrictemperature {
	public static String convertToCelsius(String input)
	{
		String[] units = input.split(" ");
		double number=Double.parseDouble(units[0]);
		if(units[1].equals("C"))
		{
			return number+" C";
		}
		else if(units[1].equals("F"))
		{
			return ((number*(5/9))-32)+" C";
		}
		else
		{
			return (number-273.15)+" C";
		}		
	}
	public static String convertToFahrenheit(String input)
	{
		String[] units = input.split(" ");
		double number=Double.parseDouble(units[0]);
		if(units[1].equals("C"))
		{
			return ((number*(9/5))+32)+" F";
		}
		else if(units[1].equals("F"))
		{
			return number+" F";
		}
		else
		{
			return (1.8*(number-273.15)+32)+" F";
		}
		
	}
	public static String convertToKelvin(String input)
	{
		String[] units = input.split(" ");
		double number=Double.parseDouble(units[0]);
		if(units[1].equals("C"))
		{
			return (number+273.15)+" K";
		}
		else if(units[1].equals("F"))
		{
			return (((number-32)/1.8)+273.15)+" K";
		}
		else
		{
			return number+" K";
		}
		
	}
	
	
}
