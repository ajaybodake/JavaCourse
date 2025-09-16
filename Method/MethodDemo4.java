public class MethodDemo4 {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        //type A
        int n1=2;
        int n2=4;
        int result1 = add(n1,n2);
        System.out.println("The addition is "+result1);

        //type B
        int result1 = add(5,10);
        System.out.println("The addition is "+result1);
    
        //type 1 calling
        int result2 = calSquare(result1);

        //type 2 calling
        int result2 = calSquare(add(n1,n2));
        System.out.println("The square is "+result2);

        //type 3 calling
        System.out.println("The square is "+calSquare(add(n1,n2)));
        
        System.out.println("MAIN END");
    }

    public static int add(int a, int b){
        System.out.println("Add start.");
        int sum = a + b;
        System.out.println("The sum is " + sum);
        System.out.println("Add end.");
        return sum;
    }

    public static int calSquare(int c) {
        System.out.println("CalSquare start.");
        int square = c * c;
        System.out.println("The square is " + square);
        System.out.println("CalSquare end.");
        return square;
    }
}