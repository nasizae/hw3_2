public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
            this.amount=sum;
    }
    public void withDraw(int sum) throws LimitExaption {
        if(sum>amount){
            throw new LimitExaption("снятие не удалось недостаточно средств)",getAmount());
        }
            this.amount-=sum;
    }
}
