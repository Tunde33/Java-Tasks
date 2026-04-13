import java.util.Scanner;

public class DivisiblityCheckShort {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
      System.out.print("Enter an integer: ");
      int number = input.nextInt();

      int[] divisors = {2, 3, 5,7};

      for (int d : divisors) {
          if (num % d ==0) {
              System.out.println(num + " is divisible by " + d);
        } else {
              System.out.println(num + " is not divisible by " + d);
          }
       }

    }
}
