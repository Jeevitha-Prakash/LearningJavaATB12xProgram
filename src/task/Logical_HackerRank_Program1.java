//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal). Use an if-else statement to classify the triangle.
//n1,n2,n3 → iso,eq,sc
package task;
import java.util.Scanner;

public class Logical_HackerRank_Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n1:");
        int n1 = scanner.nextInt();
        System.out.println("Enter the value of n1:");
        int n2 = scanner.nextInt();
        System.out.println("Enter the value of n1:");
        int n3 = scanner.nextInt();

        if(n1 == n2 && n2== n3 && n3==n1)
            System.out.println("Triangle is equilateral");

        else if(n1==n2 || n2 == n3 || n3 ==n1)
            System.out.println("Triangle is isosceles");

        else
            System.out.println("Triangle is scalene");

    }

}
