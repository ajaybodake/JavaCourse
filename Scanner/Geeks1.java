//Taking different inputs using Scanner class method such as nextInt(), nextDouble and nextLine(), etc.
// Java program to read data of various types 
// using Scanner class
import java.util.Scanner;

// Driver Class
public class Geeks1
 {
    // main function
    public static void main(String[] args) {
        
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");

        // String input
        String name = sc.nextLine();

        System.out.println("Enter your gender (M/F): ");

        // Character input
        char gender = sc.next().charAt(0);

        // Numerical data input
        // byte, short and float can be read

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your cgpa: ");
        double cgpa = sc.nextDouble();

        // Print the values to check if the input was
        // correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);

        System.out.println("CGPA: " + cgpa);
    }
}