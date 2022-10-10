package c212.src.Lab6;
import java.util.Random;
public class ThemeParkExample {
    public static void main(String[] args) {
        Random rand = new Random();
        Facilities f1 = new Facilities("PizzaHut", 10);
        Facilities f2 = new Facilities("TacoBell", 5);
        Employees e1 = new Employees("John F Kennedy", 19);
        Employees e2 = new Employees("Obama", 92);
        Rides r1 = new Rides("The Tall Boi");
        Rides r2 = new Rides("Cookie Zoom");
        Customers c1 = new Customers("Rick Ross", 34);
        Customers c2 = new Customers("Kevin Hart", 93);
        Object[] Customers = {c1, c2};
        Object[] Rides = {r1, r2};
        Object[] Restaraunts = {f1, f2};
        Object[] Employees = {e1, e2};

        //Random customer rides a random ride
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).ride((c212.src.Lab6.Rides) Rides[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).ride((c212.src.Lab6.Rides) Rides[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).ride((c212.src.Lab6.Rides) Rides[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).ride((c212.src.Lab6.Rides) Rides[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).ride((c212.src.Lab6.Rides) Rides[rand.nextInt(2)]);

        //Random customer buys and random food
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).buyFood((c212.src.Lab6.Facilities) Restaraunts[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).buyFood((c212.src.Lab6.Facilities) Restaraunts[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).buyFood((c212.src.Lab6.Facilities) Restaraunts[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).buyFood((c212.src.Lab6.Facilities) Restaraunts[rand.nextInt(2)]);
        ((c212.src.Lab6.Customers) Customers[rand.nextInt(2)]).buyFood((c212.src.Lab6.Facilities) Restaraunts[rand.nextInt(2)]);

        //Random Employee gets fired
        ((c212.src.Lab6.Employees) Employees[rand.nextInt(Employees.length)]).fire();

        //Printing Statistics
        System.out.println("The total money earned today was " + (f1.getMoneyEarned() + f2.getMoneyEarned()) + "$");
        System.out.println(f1.getName() + " earned " + f1.getMoneyEarned() + "$");
        System.out.println(f2.getName() + " earned " + f2.getMoneyEarned() + "$");
        System.out.println();
        System.out.println("The total number of rides today was " + (r1.getRidesToday() + r2.getRidesToday()));
        System.out.println(r1.getName() + " had " + r1.getRidesToday() + " rides");
        System.out.println(r2.getName() + " had " + r2.getRidesToday() + " rides");
        System.out.println();
        System.out.println(e1.getName() + " is currently " + e1.getStatus());
        System.out.println(e2.getName() + " is currently " + e2.getStatus());
        System.out.println();
        System.out.println(c1.getName() + " spent " + c1.getMoneySpent() + "$");
        System.out.println(c2.getName() + " spent " + c2.getMoneySpent() + "$");
    }
}
