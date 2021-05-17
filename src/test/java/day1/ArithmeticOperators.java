package day1;

import java.awt.*;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        float aa=10;
        float bb=3;

        float mod= aa%bb; //if need decimal in output use float
        float mod1=aa/bb;

        int sum= (a+b);// if whole no. is needed in output,use int
        float mul= (a*b);
        int div=(a/b);
        int div1=(b/a);
        int sub=(a-b);
        int modulus= (b%a);

        System.out.println(mod);
        System.out.println(mod1);
        System.out.println("sum = " +sum);
        System.out.println("mul is " +mul);
        System.out.println("div is  = " +div);
        System.out.println("div1 is " +div1);
        System.out.println("sub is " +sub);
        System.out.println(modulus);
    }
}
