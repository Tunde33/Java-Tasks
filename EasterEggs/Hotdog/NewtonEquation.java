import java.util.Scanner;

public class NewtonEquation{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.print("Enter the intial velocity (u) in meters/second: ");
      double u = input.nextDouble();
      

      System.out.print("Enter the time span (t) in seconds: ");
      double t = input.nextDouble();

      System.out.print("Enter the acceleration (a) in meters/second^2: ");
      double a = input.nextDouble();

      double s = (u * t) + (0.5 * a * t * t);


      System.out.println("The distance covered is: " + s +" meters.");


    }
}
