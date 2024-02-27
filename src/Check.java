public class Check {
    private String accountName;
    private double balance;

    public Check(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 10) {
            balance += amount;
            System.out.println("Баланс успешно пополнен на сумму: " + amount + "$");
        } else {
            throw new IllegalArgumentException("невозможно пополнить баланс на " + amount + "$");
        }
    }

    public double debit(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("на вашем балансе меньше денег");
        } else {
            balance -= amount;
            return balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "Счет №" + accountName + ": баланс = " + balance;
    }

}
