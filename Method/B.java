public class B extends A    // inheritance
{
    //method overriding

    public void print()     // instance method ... access using object creation... non-static method
    {
        System.out.println(" Hi...");
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method start...");

        B b=new B();    //created object ... access using object creation...
                
        b.print();      //called using object reference... access using object creation...

        print();    //static method... associated with class
        //can't make a static refernce to the non-static method print() from the type B.

        System.out.println("Main method end...");
    }
}