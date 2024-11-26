public class BankAccount {
    private String owner;
    private double balance;
    private static String bankName = "Generic Bank";  // Class variable

    // Constructor to initialize the owner and balance
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Instance method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Instance method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Instance method to check balance
    public String checkBalance() {
        return "Balance: $" + balance;
    }

    // Class method to change the bank name for all accounts
    public static void setBankName(String newName) {
        bankName = newName;
        System.out.println("Bank name updated to: " + bankName);
    }

    // Static method to check if the amount is valid for deposit/withdrawal
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount("John Doe", 1000);

        // Deposit money
        account.deposit(500);
        System.out.println(account.checkBalance());  // Output: Balance: $1500

        // Withdraw money
        account.withdraw(300);
        System.out.println(account.checkBalance());  // Output: Balance: $1200

        // Set the bank name (class method)
        BankAccount.setBankName("MyBank");

        // Check if an amount is valid
        System.out.println(BankAccount.isValidAmount(200));  // Output: true
    }
}
