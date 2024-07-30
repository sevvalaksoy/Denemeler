import com.workintech.example.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1234353, 2000.00, "Şevval", "sevvala@gmail.com", "ab123as");
        System.out.println(account1.getAccountBalance());
        account1.withdraw(2500);
        System.out.println(account1.getAccountBalance());
        account1.deposit(2500);
        System.out.println(account1.getAccountBalance());
        account1.withdraw(1500);
        System.out.println(account1.getAccountBalance());
    };
}





