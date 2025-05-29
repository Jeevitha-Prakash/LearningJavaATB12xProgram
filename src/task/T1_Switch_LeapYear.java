/* Write a Java program that takes a month number (1-12) and prints the number of days
 in that month using a switch statement. Handle February separately for leap years.

> a year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.

- Input -> 1 to 12, and Year = 2025
- -> 1 and year 2025 -> 31 Days
- -> 2 and year 2025 ->  28 Days, ( 2025 leap)
 */
package task;
import java.util.Scanner;

public class T1_Switch_LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 12");



        int month = scanner.nextInt();

        if(month>= Integer.MAX_VALUE)
        {
            switch(month){
                case 1,3,5,7,8,10,12:
                    System.out.println("Number of days are 31");
                    break;

                case 4,6,9,11:
                    System.out.println("Number of days are 30");
                    break;

                case 2:
                    System.out.println("Enter the year");
                    int year =  scanner.nextInt();
                    if(((year%4 == 0) &&  (year%100 != 0)) || ((year%100 == 0) && (year%400 == 0))){
                        System.out.println("Its is a Leap Year");
                    }
                    else
                    {
                        System.out.println("Its not a Leap Year");
                    }
                    break;

                default:
                    System.out.println("Kindly enter number between 1 to 12!!!");
                    break;
        }

        }
        else
        {
            System.out.println("Enter only the integer number");
        }


    }

}
