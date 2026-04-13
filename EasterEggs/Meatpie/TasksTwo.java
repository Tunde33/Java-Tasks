import java.util.Scanner;

public class TasksTwo{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("Please enter your age: ");
     int age = input.nextInt();


     System.out.println("Your age is: " + age);

     input.close();

   }
}
