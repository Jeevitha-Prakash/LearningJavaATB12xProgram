package ex_02_Java_Basics_Part2;

public class Lab24_PrintF {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("The value of the variable a is %d",a);

        System.out.println( );

        //%d -> byte,short,int,long ->data type
        //%f -> float,double
        //%s -> String
        //%b -> Boolean

        int b =20;
        System.out.printf("a value is %d, b value is %d", a, b);
    }
}
