import java.util.Scanner;

public class TasksSeventeen{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    int result = num + 10;

 
     System.out.println(num + "plus 10 is: " + result);

     input.close();
   }
}
