public class MethodDemo2{

    public static void main(String[] args){

        System.out.println("Main Method start...!");

        //Method calling/invocation
        //m1();
        //int result = m2();
        //System.out.println("Result is "+ result);

        int result = add(10,20);
        System.out.println("The result is "+ result);

        int square = result*result;
        System.out.println("The square is "+ square);

        System.out.println("Main method end...!");
    }

    //Method declaration        //recursive method is possible whcih call himself.
    public static void m1(){
        System.out.println("M1 Start.");        
        System.out.println("M1 End.");        
    }

    //Method declaration
    public static int m2(){
        System.out.println("M1 Start.");        
        System.out.println("M1 End.");
        return 101; //hardcode value
    }

    //Method declaration        //nested method is not allowed
    public static int add(int num1, int num2){      //num1, num2 are local variable.
        System.out.println(">>> Addition start");
        System.out.println("Input number 1 is "+ num1);
        System.out.println("Input number 2 is "+ num2);
        int result = num1 + num2;       //result is a local variable
        System.out.println("The addition is "+ result);
        System.out.println(">>> Addition end");

        return  result;     //return should be last statement... conditional return
    }

    public static int sub(){
        return 10;
    }
}