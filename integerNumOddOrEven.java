// check all digit is even then print true otherwise false

package fuctionAndMethod;
import java.util.Scanner;
public class integerNumOddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean result = check(n);
        System.out.println("Digit is even : "+ result);
        }
        public static boolean check(int n){
            while(n>0){
                int digit = n % 10;
                if(digit % 2 != 0){
                    return false;
                }
                n = n/10;
            }
            return true;
    }
}
