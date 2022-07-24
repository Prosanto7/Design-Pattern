package CompositPattern;

import java.util.ArrayList;

/**
 *
 * @author Lenovo-PC
 */
public abstract class Employee 
{
    String id;
    String name;
    
    Employee(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    public void printDetails()
    {
        System.out.println("Id: "+this.id+"   Name: "+this.name+"   salary: "+this.getSalary());
    }
    public abstract int getSalary();
}

class seventhGradeemployee extends Employee
{
    seventhGradeemployee(String id, String name)
    {
        super(id,name);
    }

    @Override
    public int getSalary() 
    {
       int salary=50000;
       return salary;
    }
    @Override
    public void printDetails()
    {
        super.printDetails();
    }
}

class fourthGradeemployee extends Employee
{
     ArrayList<Employee> employeeList; 
    
    fourthGradeemployee(String id, String name)
    {
        super(id,name);
        employeeList=new <Employee> ArrayList();       
    }
    
    
    public void addEmployee(Employee e)
    {
        employeeList.add(e);
    }
    @Override
    public int getSalary() 
    {
       int salary=80000;
       return salary;
    }
    public void printDetails()
    {
        super.printDetails();
        
        for(Employee e:employeeList)
        {
            e.printDetails();
        }
    }
}