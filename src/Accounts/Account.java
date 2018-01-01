package Accounts;

public abstract class Account {

    private String name;

    private AccountType type;

    private double balance;

    private double apr;

    public Account(String name, AccountType type, double balance, double apr) {
        setName(name);
        setType(type);
        setBalance(balance);
        setApr(apr);
    }

    //data: login details? eventually

    public abstract double add(double amount);

    public abstract double subtract(double amount);

    //methods:  update (login eventually), project (used by goals, budget)

    public void setName( String name ){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType( AccountType type ){
        this.type = type;
    }

    public AccountType getType(){
        return this.type;
    }

    public void setBalance( double balace ){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setApr( double apr ){
        this.apr = apr;
    }

    public double getApr(){
        return this.apr;
    }

}
