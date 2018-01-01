package Accounts;

public class CheckingAccount extends Account {

    private PayFreq freq;
    private boolean overdrawn;

    public CheckingAccount( String name, AccountType type, double balance, double apr,
                            PayFreq freq ){
        super( name, type, balance, apr );
        this.freq = freq;
        if(balance >= 0){
            this.overdrawn = false;
        }
        else {
            this.overdrawn = true;
        }
    }

    @Override
    public double add(double amount) {
        double current = this.getBalance();
        current = current + amount;
        this.setBalance(current);
        if(current >= 0){
            this.overdrawn = false;
        }
        else {
            this.overdrawn = true;
        }
        return current;
    }

    @Override
    public double subtract(double amount) {
        double current = this.getBalance();
        current = current - amount;
        this.setBalance(current);
        if(current <= 0){
            this.overdrawn = true;
        }
        else{
            this.overdrawn = false;
        }
        return current;
    }
}
