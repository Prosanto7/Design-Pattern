
package CompositPattern;


public class Main 
{
    public static void main(String []args)
    {
        seventhGradeemployee teacher1=new seventhGradeemployee("01T","Joy bhowmik");
  
        seventhGradeemployee teacher2=new seventhGradeemployee("02T","Prosanto deb");
        
        fourthGradeemployee director= new fourthGradeemployee("01D","MD. Eusha Kadir");
        director.addEmployee(teacher1);
        director.addEmployee(teacher2);
        director.printDetails();
       
       
    }
    
}
