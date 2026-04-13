import java.util.Scanner;

public class TriangularPrismVolume {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        

   System.out.print("Enter the length of the side of the equilateral triangle: ");
   double side = input.nextDouble();

  System.out.print("Enter the length of the prism: ");
  double prismLength = input.nextDouble();

  double area = (Math.sqrt(3) / 4) * (side * side);

  double volume = area * prismLength;

   System.out.println("The volume of the triangular prism is: " + volume);
    
  
   }
}
