package Problem2;

public class Student 
{
    private String name;
    private int roll,age;
    private double cgpa;
    
    public Student(String name,int roll,int age,double cgpa)
    {
    	this.setName(name);
    	this.setRoll(roll);
    	this.setAge(age);
    	this.setCgpa(cgpa);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
    
    
}
