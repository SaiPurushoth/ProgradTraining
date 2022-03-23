package MetricConvertor;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class MetrictemperatureTesting {
	Metrictemperature metricobject = new Metrictemperature();
	
	 @Test
	   public void checkMetricTemperatorConvertor() {
		 
		 String zeroC="0 C";
		 String zeroK="0 K";
		 
		 assertEquals("32.0 F",metricobject.convertToFahrenheit(zeroC));
		 assertEquals("-273.15 C",metricobject.convertToCelsius(zeroK));

	   }
	
}
