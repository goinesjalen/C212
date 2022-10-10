package c212.src.Lab3;

public class Restaurant {

    private int balance;
   
    public Restaurant(){
        this.balance = 0;
    }

    public Restaurant(int amount){
        this.balance = amount;
    }
// Takes a cost and removes it from the balance
    public void itemPurchase(int cost){
        this.balance -= cost;
    }
// Takes a cost and adds it to the balance
    public void itemSell(int cost){
        this.balance += cost;
    }
// Getter for the balance of a restaurant
    public int getBalance(){
        return this.balance;
    }
}
