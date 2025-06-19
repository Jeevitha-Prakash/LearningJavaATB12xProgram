//Enum in a Switch Statement
package ex_22_ENUM;

public class Color2 {

    enum Color11 {
        RED,
        GREEN,
        BLUE,
        YELLOW;
    }

    public static void main(String[] args) {
        Color11 c1 = Color11.YELLOW;
        // Switch case with Enum
        switch (c1) {
            case RED:
                System.out.println("Red color observed");
                break;
            case GREEN:
                System.out.println("Green color observed");
                break;
            case BLUE:
                System.out.println("Blue color observed");
                break;
            default:
                System.out.println("Other color observed");
        }
    }
}
