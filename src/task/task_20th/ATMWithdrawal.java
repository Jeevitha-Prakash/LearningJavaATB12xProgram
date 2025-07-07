package task.task_20th;
import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {
         int ACCOUNT_BALANCE = 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawal amount");
        int withdrawal_amount = sc.nextInt();

        if(withdrawal_amount <= 0)
        {
            System.out.println("Enter the valid withdrawal amount, it should be above 0 ");
        }

        else if((withdrawal_amount % 100) != 0)
        {
            System.out.println("Enter the withdrawl amount which is multiple of 100");
        }
        else if(withdrawal_amount > ACCOUNT_BALANCE)
        {
            System.out.println("Please enter the amount lesser then balance amount ");
        }
        else
        {
            ACCOUNT_BALANCE = ACCOUNT_BALANCE - withdrawal_amount;
            System.out.println("Updated balance is : " + ACCOUNT_BALANCE);
        }



    }



}
