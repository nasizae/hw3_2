public class Main {
    public static void main(String[] args){
    BankAccount account=new BankAccount();
        account.deposit(20000);
    while (true){
        try {
            account.withDraw(6000);
        } catch (LimitExaption e) {
            try {
                account.withDraw((int) e.getRemainingAmount());
            } catch (LimitExaption ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(account.getAmount());
        if(account.getAmount()==0) {
            break;
        }
        }
    }
}
