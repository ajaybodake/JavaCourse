////to initialize object

public class Student1 {
    int rollno;
    String name;
    float marks;
    boolean a;
    char x;
    static String schoolName = "ABC";

    public static void main(String[] args) {
        System.out.println("Main method start...");

        //S1 object creation
        Student s1 = new Student();     //default constructor

        System.out.println("Roll Number: "+s1.rollno);
        System.out.println("Student Name: "+s1.name);        
        System.out.println("Marks: "+s1.a);
        System.out.println("Marks: "+s1.x);
        System.out.println("School Name: "+s1.schoolName);
        System.out.println("======================");

        s1.rollno = 101;
        System.out.println("Updated roll number: "+ s1.rollno);

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        //S2 object creation
        Student s2 = new Student();

        System.out.println("Roll Number: "+s2.rollno);
        System.out.println("Student Name: "+s2.name);       
        System.out.println("Marks: "+s2.a);
        System.out.println("Marks: "+s2.x);
        System.out.println("School Name: "+s2.schoolName);

        System.out.println("Main method end...");

    }

}