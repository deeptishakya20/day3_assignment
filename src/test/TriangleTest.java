package test;
import main.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest{

	Triangle triangle=new Triangle(5,4,3);
	Triangle triangle1=new Triangle(3,4,3);
	Triangle triangle2=new Triangle(5,5,5);


	@Test  //For true condition	
	public void testIsRightTriangle(){
		assertEquals(true,triangle.isRightAngleTriangle());

	}
	
	@Test //For false condition
	public void testIsNotRightTriangle(){
		assertEquals(false,triangle1.isRightAngleTriangle());

	}

	@Test  //For true condition	
	public void testIsScaleneTriangle(){
		assertEquals(true,triangle.isScaleneTriangle());

	}

	@Test  //For false condition
	public void testIsNotScaleneTriangle(){
		assertEquals(false,triangle1.isScaleneTriangle());

	}

	@Test  //For true condition	
	public void testIsIsoscelesTriangle(){

		

		assertEquals(true,triangle1.isIsoscelesTriangle());

	}

	@Test  //For false condition when all three sides are equal
	public void testIsNotIsoscelesTriangle(){

		

		assertEquals(false,triangle2.isIsoscelesTriangle());

	}
	
	@Test  //For false condition when all sides are different
	public void testIsIsoscelesTriangleOrNot(){

		
		assertEquals(false,triangle.isIsoscelesTriangle());

	}

	@Test  //For true condition	
	public void testIsEquilateralTriangle(){

		

		assertEquals(true,triangle2.isEquilateralTriangle());

	}
		
	@Test  //For false condition when only two sides are euqal 	
	public void testIsNotEquilateralTriangleOrNot(){

		
		assertEquals(false,triangle1.isEquilateralTriangle());

	}

	@Test  //For false condition when all sides are different 	
	public void testIsEquilateralTriangleOrNot(){

		
		assertEquals(false,triangle.isEquilateralTriangle());

	}
}