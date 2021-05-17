package day1;

public class ConditionalOperators {
    public static void main(String[] args) {
        int i=10;
        int x=20;

        System.out.println(x==i && i<x); //AND operators,both the conditions should be true
        System.out.println(x==i || i<x);//OR operator,either condition should be true
        System.out.println(x!=i);//NOt Equal
        System.out.println(x==i);
        System.out.println(x<i);
        System.out.println(x>i);
        System.out.println(x<=i);
        System.out.println(i>=x);

        String fn="sonal";
        String ln="gadve";
        System.out.println(fn+ln);//Concatination


    }
}
