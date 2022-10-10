package c212.src.Lab7;

public class Account {
    protected double memberBalance;
    public void Withdraw(double amount){}
    public void Deposit(double amount){}
    public void printBalance(){}
    public static void main(String[] args) {
        Savings sav = new Savings();
        Current cur = new Current();
        sav.printBalance();
        sav.Withdraw(1000);
        sav.printBalance();
        cur.printBalance();
        cur.Withdraw(1000);
        cur.printBalance();
    }
}
class Savings extends Account{
    private final double intrestRate = 0.8;
    public Savings(){
        this.memberBalance = 20000;
    }
    public void Withdraw(double amount){
        this.memberBalance -= ((amount + (amount * intrestRate)));
    }
    public void Deposit(double amount){
        this.memberBalance += ((amount + (amount * intrestRate)));
    }
    public void printBalance(){
        System.out.println("Savings Balance: " + this.memberBalance);
    }

}
class Current extends Account{
    public Current(){
        this.memberBalance = 20000;
    }
    public void Withdraw(double amount){
        this.memberBalance -= amount;
    }
    public void Deposit(double amount){
        this.memberBalance += amount;
    }
    public void printBalance(){
        System.out.println("Current Balance: " + this.memberBalance);
    }
}
//Can we override the final method, True or False? and briefly explain the reason? - 5 
//Final methods cannot be overwridden. Final means as the word suggests, that something is final and cannot be changed.