import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Our Bank\n");

        Scanner sc = new Scanner(System.in);

        while (true) {
            String accountNumber;
            int pin;
            System.out.println("====================================");
            System.out.println("Enter Your Account Number : ");
            accountNumber = sc.nextLine(); // Read account number as String

            // Dummy check for account number
            if (!isValidAccountNumber(accountNumber)) {
                System.out.println("Error: Incorrect account number. Please try again.");
                continue;
            }

            System.out.println("Enter Your PIN : ");
            pin = sc.nextInt();
            sc.nextLine();

            // Dummy check for pin
            if (!isValidPin(accountNumber, pin)) {
                System.out.println("Error: Incorrect PIN. Please try again.");
                continue;
            }

            // If PIN is correct, show customer name and prompt to continue
            System.out.println("====================================");
            System.out.println("Welcome, Yash Shinde!");
            System.out.println("Press Enter to continue...");
            sc.nextLine(); // Wait for Enter key press

            BankAccount account = new BankAccount(accountNumber);
            account.showMenu();
        }
    }

    // Dummy validation for account number
    private static boolean isValidAccountNumber(String accountNumber) {
        // Dummy validation logic, replace with actual validation
        return accountNumber.equals("12345678");
    }

    // Dummy validation for pin
    private static boolean isValidPin(String accountNumber, int pin) {
        // Dummy validation logic, replace with actual validation
        return pin == 1234;
    }
}

class BankAccount {

    int balance;
    int previousTransaction;
    String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("Withdrawal Successful: " + amount);
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Error: Insufficient balance. Your balance is " + balance);
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    public void printMenu() {
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. View Previous Transaction");
        System.out.println("E. Exit");
    }

    void showMenu() {
        char option;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("======================================\n");
            printMenu();
            System.out.println("======================================\n");
            System.out.println("Enter Your Choice: ");
            option = Character.toUpperCase(sc.next().charAt(0));

            switch (option) {
                case 'A':
                    System.out.println("======================================\n");
                    System.out.println("Your Balance: " + balance);
                    System.out.println("======================================\n");
                    break;

                case 'B':
                    System.out.println("======================================\n");
                    System.out.println("Enter Deposit Amount: ");
                    int depositAmount = sc.nextInt();
                    deposit(depositAmount);
                    System.out.println("Deposit Successful");
                    System.out.println("======================================\n");
                    break;

                case 'C':
                    System.out.println("======================================\n");
                    System.out.println("Enter Withdrawal Amount: ");
                    int withdrawalAmount = sc.nextInt();
                    withdraw(withdrawalAmount);
                    System.out.println("======================================\n");
                    break;

                case 'D':
                    System.out.println("======================================\n");
                    getPreviousTransaction();
                    System.out.println("======================================\n");
                    break;

                case 'E':
                    System.out.println("Thank you for using our services!");
                    break;

                default:
                    System.out.println("Invalid Option! Please enter again.");
                    break;
            }
        } while (option != 'E');
    }
}