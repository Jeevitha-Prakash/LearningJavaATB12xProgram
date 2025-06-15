package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)


        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the value of a");
//        int a =0;
//        if(scanner.hasNextInt())
//        {
//            int a = scanner.nextInt();
//        }
//        else {
//            System.out.println("Kindly enter integer value");
//            System.exit(0);
//        }
//
//        System.out.println("Enter the value of b");
//        int b =0;
//        if(scanner.hasNextInt())
//        {
//            int b = scanner.nextInt();
//        }
//        else {
//            System.out.println("Kindly enter integer value");
//            System.exit(0);
//        }
        int a = readInt(scanner, "Enter the value of a");
        int b = readInt(scanner, "Enter the value of a");

        int addition = add(a,b);
        int substraction = sub(a,b);
        int multiplication = mul(a,b);
        int division = div(a,b);
        int modulous = mod(a,b);

        System.out.println("Addition -> " + addition);
        System.out.println("Substraction -> " + substraction);

        System.out.println("multiplication -> " + multiplication);
        System.out.println("division -> " + division);
        System.out.println("modulous -> " + modulous);

    }

    public static int  readInt(Scanner scanner, String prompt)
    {
        System.out.println(prompt);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else
        {
            System.out.println("Kindly enter integer value");
           System.exit(0);
            return -1;  // Unreachable, but required for compilation
        }

    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int sub(int a, int b)
    {
        return a-b;
    }

    public static int mul(int a, int b)
    {
        return a*b;
    }

    public static int div(int a, int b)
    {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a/b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
