import java.util.Scanner;

public class MonthlyInterest {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
      System.out.print("Enter the balance: ");
      double balance = input.nextDouble();

      System.out.print("Enter the annual interest rate (e.g., 3 for 3%): ");
      double annualInterestRate = input.nextDouble();

      double interest = balance * (annualInterestRate / 1200);


      System.out.println("The interest for the next month is: " + interest);
          
   }
 }
