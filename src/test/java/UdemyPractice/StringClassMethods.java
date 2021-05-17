package UdemyPractice;

import java.util.Locale;

public class StringClassMethods {
    public static void main(String[] args) {
        String a=" Java training";
        System.out.println(a);
        System.out.println(a.charAt(4));
        System.out.println(a.indexOf("r"));
        System.out.println(a.indexOf("l"));//if the characters  are not available,it will give index -1
        System.out.println(a.substring(5));
        System.out.println(a.substring(3,6));
        System.out.println(a.concat(" Sonal Learning " +a));
        System.out.println(a.length());
        System.out.println(a.trim());//remove white spaces if any
        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(a.toLowerCase());


        String arr[]=a.split("t");
        System.out.println(arr[0]);
        System.out.println(arr[1]);// slitted string into java and raining
        System.out.println(a.replace("a","i"));

    }
}
