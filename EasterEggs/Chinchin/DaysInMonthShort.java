import java.util.Scanner;
 
public class DaysInMonthShort {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
 

      System.out.print("Enter month (1-12): ");
      int month = input.nextInt();
      System.out.print("Enter years: ");
      int year = input.nextInt();

      int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};


     if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
         days[1] = 29;
     }
    
     if (month >= 1 && month <= 12) {
        System.out.println("Days: " + days[month-1]);
     } else {
         System.out.println("Invalid month!");
     }


    }
}
