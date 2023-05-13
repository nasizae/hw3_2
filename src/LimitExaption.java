public class LimitExaption extends Exception{
    private double remainingAmount;
    public LimitExaption(String message,double remainingAmount) {
        super(message);
        this.remainingAmount=remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
