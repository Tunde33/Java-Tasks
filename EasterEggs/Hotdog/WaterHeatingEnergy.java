import java.util.Scanner;

public class WaterHeatingEnergy {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.print("Enter the amount of water in kilograms: ");
      double M = input.nextDouble();

      System.out.print("Enter the initial temperature (c): ");
      double initialTemperature = input.nextDouble();

      System.out.print("Enter the final temperature (c): ");
      double finalTemperature = input.nextDouble();

      double Q = M * (finalTemperature - initialTemperature) * 4184;

     
      System.out.println("The energy needed is: " + Q + " joules.");


    }
}
