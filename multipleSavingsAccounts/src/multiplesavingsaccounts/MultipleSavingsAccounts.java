package multiplesavingsaccounts;

import java.util.Scanner;

public class MultipleSavingsAccounts {

    public static void main(String[] args) {
        System.out.println("Ch 6 Multiple Accounts by Kevin Bell");
        Scanner computerKeyboardInput = new Scanner(System.in);
        Account savings1 = new Account();
        Account savings2 = new Account();
        Account savings3 = new Account();
        int cycles = 1, i;
        double interestRate, balance;
        for (i = 1; i < 4; i++) {
            System.out.println("");
            System.out.println("New Savings Account #" + i);
            System.out.print("Enter starting balance of this Savings Account: ");
            balance = computerKeyboardInput.nextDouble();
            System.out.println("Interest rate: to enter 2.5%, type 2.5");
            System.out.print("Please enter the interest rate for this account: ");
            interestRate = computerKeyboardInput.nextDouble();
            System.out.print("Enter number of cycles to grow this Savings Account: ");
            cycles = computerKeyboardInput.nextInt();
            if (i == 1) {
                savings1.setInterestRate(interestRate);
                savings1.setBalance(balance);
                savings1.growAccount(cycles);
            } else if (i == 2) {
                savings2.setInterestRate(interestRate);
                savings2.setBalance(balance);
                savings2.growAccount(cycles);
            } else {
                savings3.setInterestRate(interestRate);
                savings3.setBalance(balance);
                savings3.growAccount(cycles);
            }
        }
        System.out.println("");
        System.out.printf("Savings Account 1: After growth, the account is worth $%-,10.2f\n", savings1.getBalance());
        System.out.printf("Savings Account 2: After growth, the account is worth $%-,10.2f\n", savings2.getBalance());
        System.out.printf("Savings Account 3: After growth, the account is worth $%-,10.2f\n", savings3.getBalance());
        System.out.println("");
    }
}
