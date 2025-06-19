package ex_22_ENUM;


enum Color13
{
    RED,BLUE,GREEN,YELLOW;

    Color13()
    {
        System.out.println("Hi" + this.name());
    }
}
public class Color3 {

    public static void main(String[] args) {
        Color13 c3 = Color13.RED;
        System.out.println(c3);
    }
}
