import java.util.Scanner;

public class TasksEight{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Enter a number: ");
     int num = input.nextInt();

     int Cube = (num)*(num)*(num);

     System.out.println("The Cube is:" + Cube);

     input.close();

   }
}
