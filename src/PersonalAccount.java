public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private Double balance;
    private Amount[] transactions;
    private int transactionCount;
    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[100];
        this.transactionCount = 0;
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("deposit amount should be positive.");
            return;
        }
        this.balance +=amount;
        transactions[transactionCount++]= new Amount(amount, TransactionType.DEPOSIT);
        //System.out.println("deposited:"+amount);
    }
    public void withdrawal(double amount){
        if (amount>this.balance){
            return;
        }
        this.balance -=amount;
        transactions[transactionCount++]= new Amount(amount, TransactionType.WITHDRAWAL);
        //System.out.println("withdrew:"+amount);
    }
    public void printHistory(){
        System.out.println("Transaction history for account:"+accountNumber + ":");
            for(int i =0;i<transactionCount;i++){
                System.out.println(transactions[i]);
            }
    }
    public double getBalance(){
        return this.balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }


}

