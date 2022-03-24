package MetricConvertor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MetriclengthTesting {
	
	Metriclength metricobject = new Metriclength();
	
	 @Test
	   public void checkMetricLengthConvertor() {
		 
		 String onecm="1 cm";
		 String onem="1 m";
		 String hundredcm="100 cm";
		 
		 assertEquals("1.0 cm",metricobject.convertToCentimeter(onecm));
		 assertEquals("100.0 cm",metricobject.convertToCentimeter(onem));
		 
		 assertEquals("0.001 km",metricobject.convertToKilometer(hundredcm));

	   }
	 @Test
	   public void checkTotalDistance() {
		 
		 String onekm="1 km";
		 String onem="1 m";
		 String hundredcm="100 cm";
		 String twohundredcm="200 cm";
		 
		 assertEquals("100200.0 cm",metricobject.totalDistance(twohundredcm,onekm));
		 
		 String output=metricobject.totalDistance(hundredcm,onem); 
		 assertEquals("2.0 m",metricobject.convertToMeter(output));
		 
	   }
	 
	 
	 @Test
	   public void checkRemainingDistance() {
		 
		 String fiftycm="50 cm";
		 String onem="1 m";
		 String twothousandcm="2000 cm";
		 
		 assertEquals("1900.0 cm",metricobject.remainingDistance(twothousandcm,onem));
		 
		 String output=metricobject.remainingDistance(fiftycm,onem); 
		 assertEquals("0.5 m",metricobject.convertToMeter(output));
		 

	   }
}
