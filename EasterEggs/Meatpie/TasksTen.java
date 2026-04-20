import java.util.Scanner;

public class TasksTen{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Enter a number: ");
     int num = input.nextInt();

     int doubled = num * 2;

     System.out.println("The double is" + num + " is: " + doubled);

     input.close();

   }
}
