package ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR

        System.out.println(true); // True
        System.out.println(true); // True
        System.out.println(true);  // True
        System.out.println(false); // False

        //  And  && // only true && true returns true
        // T || T -> T ->
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true); // True
        System.out.println(false); // False
        System.out.println(false); // False
        System.out.println(false); // False
    }
}
