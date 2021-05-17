package day2;

public class Conditions4 {
    public static void main(String[] args) {
        int age=19;
        boolean register=true;
        if (age>=18 || register==false)
        {
            System.out.println("U are eligible for vaccination.");
        }else
        {
            System.out.println("You are not eligible for vaccination as user is not registered.");
        }
    }
}
