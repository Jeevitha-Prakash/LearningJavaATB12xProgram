//Use the ternary operator, nested ternary operator.
// If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

package ex_06_Ternary_Operators;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 =8;
        int n3 =-99;
        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program
        //

      int result =  (n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3);
        System.out.println(result);
    }
}
