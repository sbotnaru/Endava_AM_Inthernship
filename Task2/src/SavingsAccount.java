
public class SavingsAccount implements ISavingsAccount {

    public static double annualInterestRate=0.0d;

    private double savingsBalance=0.0d;

    public SavingsAccount() {
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    @Override
    public double calculateMonthlyInterest() {

        if (savingsBalance>=0.0){
            savingsBalance = (savingsBalance * annualInterestRate) / 12;
        }
        else{
            System.out.println("Lack of money, your balance is negative: "+savingsBalance);
        }

        return savingsBalance;
    }

    public static void modifyInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
