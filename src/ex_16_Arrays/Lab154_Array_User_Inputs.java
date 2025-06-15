package ex_16_Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        String[] students = new String[size];

        for(int i=0; i< students.length; i++)
        {
            System.out.println("Enter the value for element ->" + i);
            students[i] = scanner.next();
        }

        for(String s : students)
        {
            System.out.println(s);
        }
    }
}
