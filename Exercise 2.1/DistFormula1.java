import java.util.Scanner;
public class DistFormula1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X value for coordinate 1");
        double x1 = sc.nextDouble();
        System.out.println("Enter Y value for coordinate 1");
        double y1 = sc.nextDouble();
        System.out.println("Enter X value for coordinate 2");
        double x2 = sc.nextDouble();
        System.out.println("Enter Y value for coordinate 2");
        double y2 = sc.nextDouble();
        double a = x1 - x2;
        double b = y1 - y2;
        double c = (a*a) + (b*b);
        System.out.println(Math.sqrt(c));
    }
}
