import java.util.Scanner;

public class TasksFive{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Enter First number: ");
     int num1 = input.nextInt();


     System.out.print("Enter second number: ");
     int num2 = input.nextInt();

     int difference = num1 - num2;

     System.out.println("The difference is:" + difference);

     input.close();

   }
}
