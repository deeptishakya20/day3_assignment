
public class Employee{  
                    private int empId;
                    private String empName;
                    private double basicSalary;


                Employee(int id, String name, double monthlySalary){
                 int empId=id;
                  String empName=name;
                  double basicSalary=monthlySalary;
               }
                
               public double getAnnualSalary(){
                
                 return (12*basicSalary);
              }

               public double getMonthlyGrossSalary(){
                       double hra=50*basicSalary/100; 
                       int medicalAllowance = 1250;
                       int conveyanceAllowance =800;
                     
                       return (basicSalary+ hra +medicalAllowance+ conveyanceAllowance);
               }
       
                 public double getAnnualGrossSalary(){
                    
                        return (12* getMonthlyGrossSalary());    
              }  

              public double getMonthlyDeductions(){
            
               double pf;
               double esic;
               int professionalTax;  
                    double temporaryPf=10*basicSalary/100;
                    if(temporaryPf<6500)
                    pf=temporaryPf;
                    else
                    pf=6500;

                    if(basicSalary<=5000)
                    esic=4.75*basicSalary/100;
                    else 
                    esic=0;
       
                    if(getMonthlyGrossSalary()<=10000)
                    professionalTax=50;
                    else
                    professionalTax=100;
                    
                    return (pf+ esic +professionalTax);
             }
                   public double getMonthlyTakeHome(){
                 
                   return (getMonthlyGrossSalary()- getMonthlyDeductions());
          }
                public double getAnnualTakeHome(){
            
                return (12 * getMonthlyTakeHome());
             
     }

   }
   