import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a starting number for the countdown: ");
        int start = inputCollector.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Blast off!");

      
    }
}

