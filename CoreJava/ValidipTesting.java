import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class ValidipTesting {
	
	
	Validip vip = new Validip();

	
	 @Test
	   public void trueValidip() {

	     assertTrue(vip.isValid("192.168.1.1"));
	     assertTrue(vip.isValid("1.1.1.1"));
	     assertTrue(vip.isValid("10.0.0.1"));
	     assertTrue(vip.isValid("127.0.0.1"));
	   }
	 @Test
	   public void FalseValidip() {
	     assertFalse(vip.isValid("10.0.1"));
	     assertFalse(vip.isValid("0.0.0.0"));
	     assertFalse(vip.isValid("255.255.255.255"));
	     assertFalse(vip.isValid("1.1.1.0"));
	   }
}