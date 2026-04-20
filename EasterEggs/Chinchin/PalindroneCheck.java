import java.util.Scanner;
  
public class PalindroneCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.print("Enter a three-digit number: ");
      int number = input.nextInt();



      int hundreds = number / 100; 
      int tens = (number / 10) % 10;
      int ones = number % 10;


      if (hundreds == ones) {
              System.out.println(number + " is a palindrome.");
        } else {
              System.out.println(number + " is not a palindrome.");
        }
    }
}

    

 

     }
}
