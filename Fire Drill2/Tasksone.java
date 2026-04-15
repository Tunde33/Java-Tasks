import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int total = 0;
        int number = 1;

        while (number <= 10) {
            System.out.print("Enter score " + number + ": ");
            int score = inputCollector.nextInt();
            total += score;
            number++;
        }

        System.out.println("The sum of the 10 scores is: " + total);

    }
}

