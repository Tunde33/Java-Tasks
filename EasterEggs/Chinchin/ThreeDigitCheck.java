import java.util.Scanner;
  
public class ThreeDigitCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


      System.out.print("Enter an integer: ");
      int number = input.nextInt();


       if (number >= 100 && number <= 999 || number <= -100 && number >= -999) {
            System.out.println(number + " is a three-digit number.");
        } else {
            System.out.println(number + " is NOT a three-digit number.");
        
        }
    }
}

    

 

     }
}
