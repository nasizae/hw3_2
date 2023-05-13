public class Main {
    public static void main(String[] args) throws LimitExaption {
    BankAccount account=new BankAccount();
        account.deposit(30000);
    while (true){
        try {
            account.withDraw(6000);
        } catch (LimitExaption e) {
            account.withDraw((int) e.getRemainingAmount());
        }
        System.out.println(account.getAmount());
        if(account.getAmount()==0) {
            break;
        }
        }
    }
}
