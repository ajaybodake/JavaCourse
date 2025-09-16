public class A
{

    public void print()     //instance method... associated with object...  access using object creation...
    {
        System.out.println(" Hello...");
    }

    public static void print()     //static method... associated with class
    {
        System.out.println(" Hello...");
    }

    public final void print()   // use final for overriding stop, behaviour can't change
    {
        System.out.println(" Hello...");
    }
}