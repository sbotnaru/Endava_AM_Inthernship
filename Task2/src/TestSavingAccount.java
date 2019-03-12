import javax.sound.midi.Soundbank;

public class TestSavingAccount {

    public static void main(String[] args) {

        System.out.println("Monthly benefit:");
        SavingsAccount saver1=new SavingsAccount(2000.00);
        SavingsAccount saver2=new SavingsAccount(3000.00);
        SavingsAccount saver3=new SavingsAccount(-2000.00);
        SavingsAccount.annualInterestRate=4;
        System.out.println(" Anual rate is "+SavingsAccount.annualInterestRate);
        System.out.println("Saver 1: "+String.format( "%.2f", saver1.calculateMonthlyInterest() )+"\nSaver 2: "+String.format( "%.2f", saver2.calculateMonthlyInterest() ));

        System.out.println("Saver 1: "+String.format( "%.2f", saver1.calculateMonthlyInterest() )+"\nSaver 2: "+String.format( "%.2f", saver2.calculateMonthlyInterest() ));

        System.out.println("Saver 3: "+String.format( "%.2f", saver3.calculateMonthlyInterest() ));

    }
}
