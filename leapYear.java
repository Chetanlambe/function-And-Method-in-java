// Calculate the leap year

package fuctionAndMethod;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = sc.nextInt();
        year(n);
    }
    public static int year(int a){
        if(a%100 != 0 && a % 4 == 0 || a%100 == 0 && a%400 == 0)
            System.out.println("leap year");
        else System.out.println("Not leap year");
        return 0;
    }
}
