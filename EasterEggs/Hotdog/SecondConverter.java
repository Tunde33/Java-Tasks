import java.util.Scanner;

public class SecondConverter {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.print("Enter the number of second: ");
      int totalSeconds = input.nextInt();

      int hours = totalSeconds / 3600;
      int minutes = (totalSeconds % 3600) / 60;
      int seconds = totalSeconds % 60;


     System.out.println(totalSeconds + " seconds = "
                        + hours + "hours, "
                        + minutes + "minutes, "
                        + seconds + "seconds. ");

    }
}
