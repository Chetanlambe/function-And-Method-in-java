package fuctionAndMethod;

import java.util.Scanner;
public class takeString {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        printMyName(name);
    }
}
