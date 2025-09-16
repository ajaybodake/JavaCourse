/*
A block of code that is associated with the static keyword is called as static block. 
This block executes when classloader loads the class. 
Remember, if your code contains any static block, it will be invoked before the main() method.

Syntax:

    static 
    {
        // your code
    }
*/

//example

 public class A{
    
    static{
        System.out.println("Inside A's static block.");
    }

    {
        System.out.println("Inside A's instance block.");
    }

    public A(){
        System.out.println("Inside A's no-arg constructor.");
    }
 }

