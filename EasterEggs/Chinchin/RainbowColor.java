import java.util.Scanner;
 
public class RainbowColor {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);


         System.out.print("Enter a number between 1 and 7: ");
         int number = input.nextInt();


         switch (number) {
             case 1: System.out.println("violet"); break;
             case 2: System.out.println("Indigo"); break;
             case 3: System.out.println("Blue"); break;
             case 4: System.out.println("Green"); break;
             case 5: System.out.println("Yellow"); break;
             case 6: System.out.println("Orange"); break;
             case 7: System.out.println("Red"); break;
             default: System.out.println("Invalid number! Please enter 1-7. ");
          }


      }
}
