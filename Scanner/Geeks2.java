// Java program to read some values using Scanner
// class and print their mean.
import java.util.Scanner;

public class Geeks2 
{
    public static void main(String[] args) {
        
        // Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Initialize sum and count of input elements
        int sum = 0, count = 0;

        System.out.println("Enter integers to calculate the mean (type 'done' to finish):");

        // Loop to read input until "done" is entered
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                
                // Read an int value
                int num = sc.nextInt();
                sum += num;
                count++;
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or type 'done' to finish.");
                }
            }
        }

        // Calculate and display the mean
        if (count > 0) {
            // Use double for precise mean calculation
            
            double mean = (double) sum / count; 
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No integers were input. Mean cannot be calculated.");
        }
     
    }
}