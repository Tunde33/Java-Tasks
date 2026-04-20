import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        

   System.out.print("Enter distance in meters: ");
   double meters = input.nextDouble();

  double feet = meters * 3.2786;

   System.out.println(meters + " meter is equal to " + feet + "feet.");
    
   }
}
