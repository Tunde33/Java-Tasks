import java.util.Scanner;

public class TasksSixteen{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    int result = num * 5;

 
     System.out.println(num + "multiplied by 5 is: " + result);

     input.close();
   }
}
