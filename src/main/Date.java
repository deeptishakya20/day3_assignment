package main;

import static java.time.temporal.ChronoUnit.DAYS;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class Date{
	private int date;
	private int month;
	private int year;
	public Date(int date,int month,int year){
		
		this.date=date;
		this.month=month;
		this.year=year;	
	}
       
	public String dateAsString(){
		String str;
                String s1="//"; 
		str=Integer.toString(date); 
		str=str+s1+Integer.toString(month); 
		str=str+s1+Integer.toString(year); 
                return str;


	}

	public boolean isSmaller(Date date2){
		
		if(date<date2.date)
	                return true;
		else
			return false;


	}

        public long[] differenceInDate(Date date2){
        	String str="-"; 
		long array[]=new long[3];
         
                DateTimeFormatter df = DateTimeFormatter.ofPattern("d-M-yyyy");

                LocalDate dateBefore = LocalDate.parse(Integer.toString(this.date)+str+Integer.toString(month)+str+Integer.toString(year), df);
 		LocalDate dateAfter = LocalDate.parse(Integer.toString(date2.date)+str+Integer.toString(date2.month)+str+Integer.toString(date2.year), df);

         	array[0] = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		array[1] = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
 		array[2] = ChronoUnit.YEARS.between(dateBefore, dateAfter);
                return array;
	}



  }