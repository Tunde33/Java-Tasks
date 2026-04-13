import java.util.Scanner;

public class TasksFourteen{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
  
     System.out.print("Enter the first number: ");
     int num1 = input.nextInt();

     System.out.print("Enter the second number: ");
     int num2 = input.nextInt();

     System.out.print("Enter the third number: ");
     int num3 = input.nextInt();
 

     double average = (num1 + num2 + num3)/3.0;

     System.out.println("The average of the three numbers is: " + average);

     input.close();
   }
}
