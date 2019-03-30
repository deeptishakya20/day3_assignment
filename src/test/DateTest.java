package test;
import main.Date;
import org.junit.Test;
import static org.junit.Assert.*;


public class DateTest{
       
	Date date1=new Date(24,5,2017);
	Date date2=new Date(29,7,2017);

	@Test
	public void testDateAsString(){
   	
		assertEquals("24//5//2017",date1.dateAsString());

	}

   

	 @Test
	public void testDateIsSmallerOrNot(){
		
		
   		
		assertEquals(true,date1.isSmaller(date2));

	}

	@Test
	public void testDateDifference(){
        	long expected[]={66,2,0};
		long actual[]=date1.differenceInDate(date2);
         	assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
		assertEquals(expected[2],actual[2]);
	}

       


} 