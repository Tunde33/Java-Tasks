import java.util.Scanner;
 
public class PositiveDifference {
    public static void main(String[] args) {
          Random rand = new Random();

      int a = rand.nextInt(10);
      int b = rand.nextInt(10);

      int diff = Math.abs(a -b);


      System.out.println("First number: " + a);
      System.out.println("Second number: " + b);
      System.out.println("Positive difference: " diff);
   }
}
 
       
