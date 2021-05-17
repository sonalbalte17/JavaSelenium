package day2;

public class Conditions3 {
    public static void main(String[] args) {
        int marks = 110;
        if (marks < 35) {
            System.out.println("Fail");
        } else if (marks >= 35 && marks <= 45) {
            System.out.println("Pass Class");
        } else if (marks >= 45 && marks <= 65) {
            System.out.println("First Class");
        } else if (marks >= 65 && marks <= 85) {
            System.out.println("Top Class");
        } else if (marks >= 85 && marks <= 100) {
            System.out.println("Merit Class");
        } else {
            System.out.println("Student is absent.");
        }
    }
}
