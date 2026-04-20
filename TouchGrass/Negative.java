import java.util.Scanner;

public class Negative  {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int number = inputCollector.nextInt();

            if (number < 0) {
                break; 
            }

            total += number;
            count++;
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("The average of the positive numbers is: " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

   
    }
}

