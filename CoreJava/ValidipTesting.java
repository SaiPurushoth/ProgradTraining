package junittesting;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class ValidipTesting {
	
	
	Validip vip = new Validip();

	
	 @Test
	   public void trueValidip() {
         boolean ch=vip.isValid("192.168.1.1");
	     assertTrue(ch);
	   }
	 @Test
	   public void FalseValidip() {
       boolean ch=vip.isValid("10.0.1");
	     assertFalse(ch);
	   }
