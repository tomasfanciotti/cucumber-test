public class BankAccount {
    int balance = 0;
    public BankAccount(int number) {
        this.balance = number;
    }


    public void deposit(int number) {
        balance += number;
    }

    public int getBalance() {
        return balance;
    }
}
