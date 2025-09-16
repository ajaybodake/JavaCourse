public class MethodDemo3{

    public static void main(String[] args){
        System.out.println("Main method start...");

        //Method calling/invocation
        m1();

        System.out.println("Main method end...");
    }

    public static void m1(){
        System.out.println("m1 method start.");
        m2();
        System.out.println("m1 method end.");

    }

    public static void m2(){
        System.out.println("m2 method start.");
        m3();
        System.out.println("m2 method end.");

    }

    public static void m3(){
        System.out.println("m3 method start.");
        m4();
        System.out.println("m3 method end.");

    }

    public static void m4(){
        System.out.println("m4 method start.");
        System.out.println("m4 method end.");

    }
}