package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.Main_class;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class JunitTestCase {
	
	Main_class r = new Main_class();
			    	
     @Test
	 public void MatchFirstName() {
	 boolean result1=r.firstName("Ritesh");
	 assertEquals(result1,true);
		 }
     
     @Test
     public void MatchLastName() {
        	boolean result2=r.LastName("Khunte");
        assertEquals(result2, true);

}
     
     @Test
     public void MatchEmailAddress() {
        	boolean result3=r.EmailAddress("riteshkhunte05@gmail.com");
        assertEquals(result3, true);

}
     
     @Test
     public void MatchMobileNumber() {
        	boolean result4=r.MobileNumber("+91 9168112901");
        assertEquals(result4, true);

}
     
     @Test
     public void MatchPassward_8_Character() {
        	boolean result5=r.passRule1("abcdefpp123");
        assertEquals(result5, true);
}
}
