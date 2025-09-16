//Class declaration
public class MethodDemo1{

    //Main method declaration
    public static void main(String[] args){

        System.out.println("\n Main method start...");

        //static method calling
        m1();

        //non-method invocation
        //creating an object of MethodDemo1 class
        MethodDemo1 obj = new MethodDemo1();
        obj.m2();       //non-static method invocation without parameters

        obj.m3(2);      //non-static method invocation with parameters
        
        System.out.println("\n Main method end...\n ");
    }

    
    //static method declaration - 
    //it is associated with the class and to access, no need to create an object of class.
    public static void m1(){
        System.out.println("\n M1 method start.");
        int x=10;
        int y=20;
        int sum=x+y;
        System.out.println("The sum of " + x + " and " + y + " is " + sum + ".");
        System.out.println("M1 method end. \n");
    }

    //non-static method declaration
    //it is associated with the object, not class and to access it, we have to create an object of class.
    public void m2(){
        System.out.println("\n M2 method start.");
        int a=20;
        int b=10;
        int sub=a-b;
        System.out.println("The substraction of " + a + " minus " + b + " is " + sub + ".");
        System.out.println("M2 method end. \n");
    }

    public void m3(int j){
        System.out.println("\n M3 method start.");
        int square=j*j;
        System.out.println("The square of " + j + " is " + square + ".");
        System.out.println("M3 method end. \n");
    }
}