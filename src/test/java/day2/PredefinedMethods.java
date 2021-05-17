package day2;

public class PredefinedMethods {
    public static void main(String[] args) {
        double d=Math.sqrt(4.6);
        System.out.println(d);
        double p=Math.PI;
        System.out.println(p);
        double ran=Math.random();
        System.out.println(ran*8795);
        //typecasting or upcasting
        Integer par= (int) (ran*8795);
        System.out.println(par);
    }
}
