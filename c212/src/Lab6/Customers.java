package c212.src.Lab6;

public class Customers extends People{
    private int moneySpent;
    public Customers(String name, int age){
        super(name, age);
        this.moneySpent = 0;
    }
    public void buyFood(Facilities place){
        moneySpent += place.cost;
        place.moneyEarned += place.cost;
        // System.out.println(super.name + "bought food for " + place.cost + "$");
    }
    public int getMoneySpent(){
        return this.moneySpent;
    }
    public void ride(Rides ride){
        // System.out.println(super.name + " rode " + ride.name);
        ride.ridesToday += 1;
    }

}
