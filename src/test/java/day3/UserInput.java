package day3;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        add(num1, num2);
        System.out.println("Enter third number:");
        float num3 = sc.nextFloat();
        System.out.println("Enter fourth number:");
        float num4 = sc.nextFloat();
        mul(num3, num4);
    }

    public static void add(int x, int y) {
        int sum = x + y;
        System.out.println("Addition is " + sum);
    }

    public static void mul(double x, double y) {
        double product = x * y;
        System.out.println("Multiplication is  " + product);
    }
}
