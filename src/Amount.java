public class Amount {
    double amount;
    TransactionType transactionType;

    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String toString() {
        return transactionType + " :" + amount;
    }
}