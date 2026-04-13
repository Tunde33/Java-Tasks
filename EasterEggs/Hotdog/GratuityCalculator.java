import java.util.scanner;

public class GratuityCalculator {
  public static void main(String[] args) {

    System.out.print("Enter the subtotal: ");
    double subtotal = input.nextDouble();

    System.out.print("Enter the gratuity rate (e.g., 12 for 12%): ");
    double gratuityRate = input.nextDouble();

    double gratuity = subtotal * (gratuityRate / 100);

    double total = subtotal + gratuity;

    System.out.println("Gratuity: $" + gratuity);
    System.out.println("Total: $" + total);

   }
}
