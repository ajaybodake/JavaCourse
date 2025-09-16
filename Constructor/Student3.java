public class Student3 {

    int rollno;     //instance variable
    String name;    
    float marks;
    static String schName = "ABC";      //static variable
    
    public Student3()       //no-arg constructor
    {
        //to initialize object
    }
    public Student3(int rn, String nm, float mks)       //parameterized constructor
    {
        //super();      //this();
        this.rollno = rn;
        this.name = nm;
        this.marks = mks;
    }

    public Student3(int rn, String nm)       //parameterized constructor
    {
        //super();      //this();
        this.rollno = rn;
        this.name = nm;
        this.marks = mks;
    }

    public Student3(int rn)       //parameterized constructor
    {
        //super();      //this();
        this.rollno = rn;
        this.name = nm;
        this.marks = mks;
    }



    public static void main(String[] args) {        //main method
        System.out.println("Main method start...");

        //S1 object creation        
        Student3 s1 = new Student3(101, "ajay", 65.5f);            

        System.out.println("Roll no:" + s1.rollno);
        System.out.println("Name:" + s1.name);
        System.out.println("Marks:" + s1.marks);
        System.out.println("School Name:" + s1.schName);

        System.out.println("================================");

        Student3 s2 = new Student3(102, "ash", 75.5f);         

        System.out.println("Roll no:" + s2.rollno);
        System.out.println("Name:" + s2.name);
        System.out.println("Marks:" + s2.marks);
        System.out.println("School Name:" + s2.schName);


        System.out.println("Main method end...");
    }

}