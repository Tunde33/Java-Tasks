import java.util.Scanner;
  
public class SumWithoutLoop {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.print("Enter a positive integer n: ");
      int n = input.nextInt();

      int sum = n * (n + 1) / 2;

    
      System.out.println("Sum of 1 + 2 + ... +" + n + " = " + sum);

     }
}
