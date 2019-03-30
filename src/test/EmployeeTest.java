 import java.util.Scanner;
public  class EmployeeTest{

         public static void main(String args[])
    	{

           Scanner input=new Scanner(System.in);
   	     
          
               System.out.println("Enter employee id:");
               int id=input.nextInt();
               System.out.println("Enter employee name:");
               String name=input.next();
               System.out.println("Enter employee basic salary:");
               double monthlySalary=input.nextDouble();
                
                 input.close();

                  Employee e = new Employee(id, name, monthlySalary);

                      System.out.println("Annual Salary= "+ e.getAnnualSalary());

                      System.out.println("Monthly Gross Salary= "+e.getMonthlyGrossSalary());
                      System.out.println("Annual Gross Salary= "+e.getAnnualGrossSalary());

                      System.out.println("Monthly Deduction= "+e.getMonthlyDeductions() );
                      System.out.println("Monthly Take Home= "+e.getMonthlyTakeHome());
                      System.out.println("Annual Take Home= "+e.getAnnualTakeHome());
 
        }  

}