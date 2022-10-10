package c212.src.Lab6;

public class Rides{
    public String name;
    public int ridesToday;
    public Rides(String name){
        this.name = name;
        this.ridesToday = 0;
    }
    public String getName(){
        return this.name;
    }
    public int getRidesToday(){
        return this.ridesToday;
    }
}
