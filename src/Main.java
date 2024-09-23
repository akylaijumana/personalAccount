//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, "Ruslan A");
        account.deposit(1000);
        account.withdrawal(200);
        account.deposit(200);
        account.withdrawal(1000);
        account.deposit(500);
        account.withdrawal(250);
        account.deposit(500);
        account.withdrawal(750);
        account.printHistory();
        System.out.println(account.getAccountHolder());

    }
}