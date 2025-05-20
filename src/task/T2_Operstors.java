package task;

public class T2_Operstors {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);

        //       a |b |c
        //a+b -> 11+22+11(12)+22(23)+13+24
        //a->13
        //b->24
       // c->103
    }
}
