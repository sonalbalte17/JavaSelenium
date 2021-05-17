package day1;


public class Calculator {
    public static void main(String[] args) {
        //syntax: classname reference = new Class---(class object)
        Calculator cal = new Calculator();
        cal.add(10, 20);
        double val = cal.sub(10.2, 8.4);
        System.out.println("Value:" + (val * 4));
        cal.mul(10, 78);
        cal.div(5.35, 8.2);
        cal.mod(8.9, 7.5);

    }

    public void add(int x, int y) {
        int sum = x + y;
        System.out.println("Addition:" + sum);
    }

    public double sub(double x, double y) {
        double minus = x - y;
        //System.out.println("Subtraction:" +minus);
        return minus;
    }

    public int mul(int x, int y) {
        int product = x * y;
        System.out.println("Multiplication :" + product);
        return product;
    }

    public void div(double x, double y) {
        double divide = x / y;
        System.out.println("Division:" + divide);
    }

    public void mod(double x, double y) {
        double remainder = x % y;
        System.out.println("Modulus:" + remainder);
    }
}
