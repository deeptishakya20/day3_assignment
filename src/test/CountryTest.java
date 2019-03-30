package test;
import main.Country;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CountryTest{

	Country country[];
	@Before
	public void setUp(){
	
	
		country=new Country[3];
		country[0]=new Country("UK", 240000, 723987423, 8731894);
		country[1]=new Country("US", 243400, 45667423, 4636894);
		country[2]=new Country("Africa", 740000, 12387423, 876189);
	}
	
	@Test
	public void testLargestArea(){
		String expectedS=country[2].getCountryName();
 
		long expected[]=new long[3];
		long actual[]=new long[3];
		expected[0]=country[2].getCountryArea();
		expected[1]=country[2].getCountryPopulation();
		expected[2]=country[2].getCountryDensity();
	
	
		Country cnt=new Country();

     		String actualS=country[cnt.largestArea(country)].getCountryName();
	
		actual[0]=country[cnt.largestArea(country)].getCountryArea();
		actual[1]=country[cnt.largestArea(country)].getCountryPopulation();
		actual[2]=country[cnt.largestArea(country)].getCountryDensity();

		assertEquals(expectedS,actualS);
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
		assertEquals(expected[2],actual[2]);
	}


	public void testLargestPopulation(){
		Country cnt=new Country();
		assertEquals(country[0].getCountryPopulation(),country[cnt.largestPopulation(country)].getCountryPopulation());
	}


	public void testLargestPopulation0Density(){
		Country cnt=new Country();
		assertEquals(country[0].getCountryDensity(),country[cnt.largestPopulationDensity(country)].getCountryDensity());
	}
	

	

}