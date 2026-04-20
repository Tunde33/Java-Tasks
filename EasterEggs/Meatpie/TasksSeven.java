import java.util.Scanner;

public class TasksSeven{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Enter a number: ");
     int num = input.nextInt();

     int Square = (num)*(num);

     System.out.println("The Square is:" + Square);

     input.close();

   }
}
