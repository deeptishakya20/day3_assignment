package main;

public class Triangle{

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public void setSide1(double side1){
		this.side1=side1;
	}
	
	public double getSide1(){
		return this.side1;	
	}
	
	public void setSide2(double side2){
		this.side2=side2;
	}
	
	public double getSide2(){
		return this.side2;	
	}
	
	public void setSide3(double side3){
		this.side3=side3;
	}

	public double getSide3(){
		return this.side3;	
	}
	
	public boolean isRightAngleTriangle(){
		double hypotenous=0;
		double perpendicular=0;
		double base=0;
		if(side1>side2 && side1>side3){
			hypotenous=side1*side1;
			perpendicular=side2*side2;
			base=side3*side3;
		}
		else if(side2>side1 && side2>side3){
			hypotenous=side2*side2;
			perpendicular=side1*side1;
			base=side3*side3;
		}
		else{
			hypotenous=side3*side3;
			perpendicular=side1*side1;
			base=side2*side2;
		
		}
		if(hypotenous==(perpendicular+base))
		return true;
		else
		return false;

	}
	
	public boolean isScaleneTriangle(){
		if(side1!=side2 && side1!=side3){
				
			if(side2!=side3)
			return true;
			else
			return false;
		}
		else{
			return false;
		}
	}

	public boolean isIsoscelesTriangle(){

		if((side1 == side2 && side1 != side3) || (side2 == side3 && side1 != side2) || (side1== side3 && side2 != side1))
			return true;
		else 
			return false;

	}

	public boolean isEquilateralTriangle(){
		if(side1==side2 && side2==side3)
			return true;
		else
			return false;

	}

}