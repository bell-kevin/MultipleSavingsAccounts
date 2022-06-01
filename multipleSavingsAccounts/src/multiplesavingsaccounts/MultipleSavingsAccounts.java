package multiplesavingsaccounts;

import java.util.Scanner;

public class MultipleSavingsAccounts {

    public static void main(String[] args) {
        System.out.println("Ch 6 Multiple Accounts by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        Account savings1 = new Account();
        Account savings2 = new Account();
        Account savings3 = new Account();
        int cycles = 0;
        double interestRate;
        double balance;
        int i = 0;
        //for (i = 0; i < cycles; i++) {
            System.out.print("Enter starting balance of this Savings Account: ");
            balance = computerKeyboardInput.nextDouble();
            System.out.println("Interest rate: to enter 2.5%, type 2.5");
            System.out.print("Please enter the interest rate for this account: ");
            interestRate = computerKeyboardInput.nextDouble();
            System.out.print("Enter number of cycles to grow this Savings Account: ");
            cycles = computerKeyboardInput.nextInt();
            savings1.setInterestRate(interestRate);
            savings1.setBalance(balance);
            savings1.growAccount(cycles);
       // }
        System.out.printf("After %d cycles, the account is worth $%-,10.2f\n", cycles, savings1.getBalance());
    }
}
