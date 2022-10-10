package c212.src.Lab6;

public class Facilities {
    public int moneyEarned;
    private String name;
    public int cost;
    public Facilities(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.moneyEarned = 0;
    }
    public int getMoneyEarned(){
        return this.moneyEarned;
    }
    public String getName(){
        return this.name;
    }
    public int getCost(){
        return this.cost;
    }
}
