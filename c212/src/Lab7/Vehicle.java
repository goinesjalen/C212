package c212.src.Lab7;
//the main vehicle class
public class Vehicle{
    protected String make;
    protected String color;
    protected int year;
    protected String model;
    
    //creates a vehicle CONSTRUCTOR
    public Vehicle(String make, String color, int year, String model){
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }
    //prints the details of a vehicle
    public void printDetails(){
        System.out.println("Make: " + this.make);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
        System.out.println("Model: " + this.model);
    }
}

class Car extends Vehicle{
private String bodyStyle;
private int topSpeed;
private int currSpeed;

//subclass car that has information about a car
public Car(String make, String color, int year, String model, String bodyStyle, int topSpeed, int currSpeed){
    super(make, color, year, model);
    this.bodyStyle = bodyStyle;
    this.topSpeed = topSpeed;
    this.currSpeed = currSpeed;
}
//gives the current speed plus the top speed
public int accelerate(){
    return currSpeed + topSpeed;
}
//prints information about a car
public void carDetails(){
    super.printDetails();
    System.out.println("Body Style: " + this.bodyStyle);
    System.out.println("Top Speed: " + this.topSpeed);
    System.out.println("Current Speed: " + this.currSpeed);
}
public static void main(String[] args) {
    Car Audi = new Car("Audi", "Grey", 2021, "R8", "Coupe", 128, 100);
    Audi.carDetails();
}
}
/*
a. What are the different types of Inheritance? - 4 
Single and multilevel inheritance are supported by java, but outside of java there is multiple inheritance as well.
b. What are final and super keyword? - 4 
final meand that a variable cannot be modified in the future, and super is a way to call the superclass in a subclass. 
c. Multiple inheritance is not supported by Java, Explain? - 2 
This means that one class cannot inherit from two classes at the same time.
*/