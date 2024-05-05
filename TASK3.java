package codsoft;
import java.util.Scanner;

// ATM class 
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM.Choose one of the options below:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }

    private void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you want to deposite: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount you want to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}

// class representing the user's bank account
class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}


public class TASK3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        ATM atm = new ATM(bankAccount);

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            // Display ATM menu
            atm.displayMenu();

            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            atm.processOption(option);

        } while (option != 4);
    }
    
}

