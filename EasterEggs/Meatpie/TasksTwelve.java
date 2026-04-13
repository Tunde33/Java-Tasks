import java.util.Scanner;

public class TasksTwelve{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Enter the first number: ");
     int num1 = input.nextInt();

     System.out.print("Enter the second number: ");
     int num2 = input.nextInt();

     System.out.println("The first number is: " + num1);
     System.out.println("The second number is: " + num2);

     input.close();

   }
}
