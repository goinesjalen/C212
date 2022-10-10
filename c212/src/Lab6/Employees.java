package c212.src.Lab6;

public class Employees extends People{
    private String status;
    public Employees(String name, int age){
        super(name, age);
        // System.out.println(this.name + " was hired!");
        this.status = "hired";
    }
    public void fire(){
        this.status = "fired";
        // System.out.println(super.name + " was fired!");
    }
    public String getStatus(){
        return this.status;
    }
}
