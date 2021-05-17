package UdemyPractice;

public class ReverseString {
    public static void main(String[] args) {
        String s = "2mom1";
        String t="";
        System.out.println(s.length());
      int n = s.length()-1;
        for (int i = n; i >=0; i--) {
           // System.out.print(s.charAt(i));//finding charcters at specified index
            t= t+ s.charAt(i);

        }System.out.println(t);

        if(s==t)
        {
            System.out.println("String is palindrome.");
        }
        else{
          System.out.println("String is not palindrome.");

    }
}}
