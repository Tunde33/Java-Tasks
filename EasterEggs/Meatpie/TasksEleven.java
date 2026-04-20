import java.util.Scanner;

public class TasksEleven{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Enter a number: ");
     double num = input.nextDouble();

     double half = num / 2;

     System.out.println("Half of " + num + " is: " + half);

     input.close();

   }
}
