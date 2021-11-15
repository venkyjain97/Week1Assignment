import java.util.Scanner;
public class InchToMeters{
    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(meters);
    }
   }