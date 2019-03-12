
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

        if (savingsBalance>0.0){
            savingsBalance = (savingsBalance * (annualInterestRate/100)) / 12;
        }
        else{
            System.out.println("Your balance is negative: "+savingsBalance+ "\n Your annual intrest rate will be calculated with interest rate of: "+(annualInterestRate/2));
            savingsBalance = (Math.abs(savingsBalance) * ((annualInterestRate/2))/100) / 12;
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
