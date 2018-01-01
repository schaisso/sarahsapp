package Accounts;

public class SavingsAccount extends Account {

    public SavingsAccount( String name, AccountType type, double balance, double apr,
                            PayFreq freq ){
        super( name, type, balance, apr );
    }
    @Override
    public double add(double amount) {
        double current = this.getBalance();
        current = current + amount;
        this.setBalance(current);
        return current;
    }

    @Override
    public double subtract(double amount) {
        double current = this.getBalance();
        current = current - amount;
        this.setBalance(current);
        return current;
    }
}
