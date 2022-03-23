package MetricConvertor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MetricvolumeTesting {

	Metricvolume metricobject = new Metricvolume();
	
	 @Test
	   public void checkMetricVolumeConvertor() {
		 
		 String oneg="1 g";
		 String ponekg="0.1 kg";
		 
		 assertEquals("1.0 g",metricobject.convertToGrams(oneg));
		 assertEquals("100.0 g",metricobject.convertToGrams(ponekg));

	   }
	 @Test
	   public void checkTotalVolume() {
		 
		 String onekg="1 kg";
		 String teng="10 g";
		 
		 assertEquals("1010.0 g",metricobject.totalVolume(teng,onekg));
		 
		 
	   }
	 
	 
	 @Test
	   public void checkRemainingVolume() {
		 
		 String onepfivekg="1.5 kg";
		 String fivehundredg="500 g"; 
		 String output=metricobject.remainingVolume(fivehundredg,onepfivekg); 
		 assertEquals("1.0 kg",metricobject.convertToKilogram(output));
		 

	   }	
	
	
	
}
