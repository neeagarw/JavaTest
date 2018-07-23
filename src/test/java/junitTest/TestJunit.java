package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	
   String message = "Hello World";	
   Message messageUtil = new Message(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}