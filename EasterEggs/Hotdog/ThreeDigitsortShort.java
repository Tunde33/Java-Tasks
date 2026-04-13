import java.util.Scanner;

public class ThreeDigitsortShort {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = in.nextInt();
      int[] d = {num/100, (num/10)%10, num%10};
      Arrays.sort(d);
      System.out.println(d[0]+" "+d[1]+" "+d[2]);


    }
}
