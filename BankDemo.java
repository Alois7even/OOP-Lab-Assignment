import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV-001", 500.00, 100.00));
        accounts.add(new CurrentAccount("CUR-001", 200.00, 300.00));
        accounts.add(new SavingsAccount("SAV-002", 1000.00, 100.00));
        accounts.add(new CurrentAccount("CUR-002", 100.00, 300.00));

        System.out.println("=== Opening balances ===");
        for (Account a : accounts) {
            System.out.printf("%s: %.2f%n", a.getAccountNumber(), a.getBalance());
        }

        // Withdraw 450 from every account through the Account reference only
        System.out.println("\n=== Polymorphic withdraw(450.00) ===");
        for (Account a : accounts) {
            a.withdraw(450.00);
        }

        // Month-end through the Account reference only
        System.out.println("\n=== Polymorphic endOfMonth() ===");
        for (Account a : accounts) {
            a.endOfMonth();
        }

        System.out.println("\n=== Final balances ===");
        for (Account a : accounts) {
            System.out.printf("%s: %.2f%n", a.getAccountNumber(), a.getBalance());
        }
    }
}
