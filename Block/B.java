 public class B extends A{

    static{
        System.out.println("Inside B's static block.");
    }

    {
        System.out.println("Inside B's instance block.");
    }

    public B()
    {
        System.out.println("Inside B's no-arg constructor.");
    }
 }