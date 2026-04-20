import java.util.Scanner;

public class TasksNine{
    public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);


     System.out.print("what is your favourite color? ");
     String color = input.nextLine();

     

     System.out.println("Your favourite color is:" + color);

     input.close();

   }
}
