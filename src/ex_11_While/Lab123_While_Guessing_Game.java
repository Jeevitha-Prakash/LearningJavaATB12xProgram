package ex_11_While;
import java.util.Random;
import java.util.Scanner;


public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToBeGuessed = random.nextInt(100)+1;
       // System.out.println(numberToBeGuessed);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100");
        int number;
        int attempts = 0;

        while(true)
        {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Consume invalid token
                continue;
            }
           number =  scanner.nextInt();
           attempts++;

            if (number < 1 || number > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            if(number > numberToBeGuessed)
            {
                System.out.println("Too High, try again");
            }
            else if(number < numberToBeGuessed)
            {
                System.out.println("Too Low, try again");
            }
            else
            {
                System.out.println("You are correct."+ " You gussed by " + attempts + " attempts");
                break;
            }
        }
    }
}
