public class Student2 {

    int rollno;     //instance variable
    String name;    
    float marks;
    static String schName = "ABC";      //static variable

    public static void main(String[] args) {        //main method

        //S1 object creation
        Student s1 = new Student();     //default constructor

        //initialization values to instance variable using s1 object
        s1.rollno = 101;
        s1.name = "ajay";
        s1.marks = 60.5f;

        System.out.println("Roll no:" + s1.rollno);
        System.out.println("Name:" + s1.name);
        System.out.println("Marks:" + s1.marks);
        System.out.println("School Name:" + s1.schName);


        //s2 object creation
        Student s2 = new Student();     //default constructor

        //initialization values to instance variable using s1 object
        s1.rollno = 102;
        s1.name = "ash";
        s1.marks = 65.5f;

        System.out.println("Roll no:" + s2.rollno);
        System.out.println("Name:" + s2.name);
        System.out.println("Marks:" + s2.marks);
        System.out.println("School Name:" + s2.schName);

        
    }

}