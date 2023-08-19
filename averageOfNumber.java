package fuctionAndMethod;
import java.util.Scanner;
public class averageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double  a = sc.nextInt();
        System.out.println("Enter the second number");
        double b = sc.nextInt();
        System.out.println("Enter the third number");
        double c = sc.nextInt();

        System.out.println("Average is "+ average(a, b, c));

    }

    public static double average(double  a, double b, double c){
        double avg = (a + b + c)/3;
         return avg;
    }
}
