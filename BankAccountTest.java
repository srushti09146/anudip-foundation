class BankAccount {
    private String accountHolderName;
    private String bankName;
    private double accountBalance;

    
    public BankAccount(String accountHolderName, String bankName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = initialBalance;
    }

    
    public double getBalance() {
        return accountBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited ₹" + amount + " to " + accountHolderName + "'s account at " + bankName);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountHolderName + "'s account at " + bankName);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    
    public void displayBalance() {
        System.out.println(accountHolderName + " (" + bankName + ") - Balance: ₹" + accountBalance);
    }
}


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Aarav", "ICICI", 5000.0);
        BankAccount account2 = new BankAccount("Isha", "HDFC", 8000.0);
        BankAccount account3 = new BankAccount("Dev", "SBI", 10000.0);

        account1.deposit(2000);
        account1.withdraw(1500);

        account2.deposit(1000);
        account2.withdraw(2000);

        account3.deposit(500);
        account3.withdraw(3000);

        account1.displayBalance();
        account2.displayBalance();
        account3.displayBalance();
    }
}
