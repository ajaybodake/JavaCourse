// A Java program to show that a parent reference
// referring to a Child is an instance of Child

class Parent {
}
class Child extends Parent {
}

// Driver class
class InstanceOf4 {
    // main function
    public static void main(String[] args)
    {
        // Reference is Parent type but object is
        // of child type.
        Parent cobj = new Child();
        if (cobj instanceof Child)
            System.out.println("cobj is instance of Child");
        else
            System.out.println(
                "cobj is NOT instance of Child");
    }
}