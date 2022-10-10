package c212.src.Lab6;

public class People {
    protected String name;
    private int age;
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
