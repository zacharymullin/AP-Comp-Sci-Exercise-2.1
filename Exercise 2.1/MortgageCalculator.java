import java.util.Scanner;

public class MortgageCalculator
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle:");
        double p = sc.nextDouble();
        System.out.println("Enter the rate:");
        double r = sc.nextDouble();
        System.out.println("Enter the number of years:");
        double n = sc.nextDouble();
        double a = p * Math.pow(1+r,n);
        System.out.println("The resulting amount is:");
        System.out.println(a);        
    }
}