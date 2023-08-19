// covert the temperature degree celsius into fahrenheit

package fuctionAndMethod;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature value");
        float a = sc.nextFloat(); // temp in degree celsius
        System.out.println("Temp in degree celsius : "+ a);

        System.out.println("Temp in fahrenheit : "+ temp(a));
    }
    public static float temp(float a){
        float b = (a * 9/5) + 32; // temp in fahrenheit
        return b;
    }
}
