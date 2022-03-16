import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student ("Abc", 101, 19, 3.75);
        Student s2 = new Student ("Bcd", 100, 25, 3.45);
        Student s3 = new Student ("Cde", 103, 22, 3.60);
        Student s4 = new Student ("Def", 102, 24, 3.55);
        Student s5 = new Student ("Qrs", 101, 20, 3.60);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Collections.sort(studentList, new Sorter().rollGpaComparator);
        for (Student s: studentList) System.out.println(s);
    }
}
