package day2;

public class GlobalLocalVariable {
    //instance variable or global variable
   static  String city="Jersey City";

    public static void main(String[] args) {

GlobalLocalVariable gl=new GlobalLocalVariable();
gl.studentAdmisn();
System.out.println(city);
studentRank();

    }
    //non-static method
    public void studentAdmisn(){
        //local variable
        String un="JNU";
        System.out.println(un);
        System.out.println(city);

    }

    //static method
    public static void studentRank(){
        System.out.println(city);
    }
}
