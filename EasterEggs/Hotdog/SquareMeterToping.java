import java.util.Scanner;

public class SquareMeterToping {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        

   System.out.print("Enter area in square meters: ");
   double squareMeters = input.nextDouble();

  double ping = squareMeters * 0.3025;

   System.out.println(squareMeters + " square meters is equal to " + ping + "ping.");
    
   }
}
