import java.util.Comparator;

public class Student {
    public String name;
    public int roll;
    public int age;
    public double cgpa;

    public Student(String name, int roll, int age, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String toString () {
        String str = "Name: " + this.name + " Roll: " + this.roll;
        str = str + " Age: " + this.age + " CGPA: " + this.cgpa;
        return str;
    }



}
