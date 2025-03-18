import java.util.ArrayList;

class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

  
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    
    public Account openAccount(Customer customer, int initialBalance) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            System.out.println(customer.getName() + " is now a customer of " + bankName);
        }

        Account account = new Account(this, customer, initialBalance);
        customer.addAccount(account);
        System.out.println("New account opened for " + customer.getName() + " at " + bankName + " with balance Rs " + initialBalance);
        return account;
    }

    
    public void bankDetails() {
        System.out.println("\nBank: " + bankName);
        System.out.println("Customers: ");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public String getBankName() {
        return bankName;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;


    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nBalance details for " + name + ":");
        if (accounts.isEmpty()) {
            System.out.println("  No accounts found.");
        } else {
            for (Account acc : accounts) {
                System.out.println("  Bank: " + acc.getBank().getBankName() + " | Balance: Rs " + acc.getBalance());
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - Accounts: ");
        if (accounts.isEmpty()) {
            sb.append("No accounts found.");
        } else {
            for (Account acc : accounts) {
                sb.append("[Bank: ").append(acc.getBank().getBankName())
                  .append(", Balance: Rs ").append(acc.getBalance()).append("] ");
            }
        }
        return sb.toString();
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private int balance;


    public Account(Bank bank, Customer customer, int balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs " + amount + " deposited. New balance: Rs " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn. New balance: Rs " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI Bank");

       
        Customer customer1 = new Customer("Mohit");
        Customer customer2 = new Customer("Sam");

        
        Account acc1 = bank.openAccount(customer1, 1000);
        Account acc2 = bank.openAccount(customer2, 2000);
        Account acc3 = bank.openAccount(customer1, 500);

        
        acc1.deposit(500);
        acc1.withdraw(300);
        acc2.withdraw(2500);  // Insufficient funds

        
        customer1.viewBalance();
        customer2.viewBalance();

        
        bank.bankDetails();
    }
}
