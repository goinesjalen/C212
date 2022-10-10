package c212.src.Lab11;

import java.util.ArrayList;

public class Farm {

    /*
    Method inventory takes in an ArrayList of generic type. Method returns a string representing a
    listing of the toString outputs of all objects in the ArrayList (exact String format up to you).
    */
    public static <E> String inventory(ArrayList<E> itemList){

    }

    /*
    Method list takes in an ArrayList of generic objects that extend the Animal interface.
    Method returns a string of each object’s animal sound compiled into a single String.
     */
    public static <E extends Animal> String listen(ArrayList<E> animalList){

    }

    /*
    Method isSellable takes in an object that extends the Item interface.
    Return value is true if the object is sellable and false if not.
    In order for an object to be sellable, it must be healthy AND meet the following age requirements:

    Cow: must be older than age 2
    Chicken: must be older than age 1
    Crop: must be older than age 3

    If the object is not an instance of one of those three classes, the method will return false.
    Please note that this method will require you to cast the generic object into one of the
    three classes. In order to do so, you must first check if the object is an instance of the class
    you want to cast it to. You can do so using the instanceof operator.
     */
    public static <E extends Item> boolean isSellable(E item){

    }

    /*
    Method sell takes in an ArrayList of generic object type that extends the Item interface.
    For each item in the ArrayList, determine if the item is sellable.
    If so, get the price of the object and add it to a total sum.
    Return the total sum after iterating through each item.
     */
    public static <E extends Item> int sell(ArrayList<E> sellList){

    }

    /*
    Method takes in an ArrayList of generic object type that extends the Comparable interface.
    Using the compareTo method, return the index of the most valuable object in the ArrayList.
     */
    public static <E extends Comparable<E>> int getMostValuable(ArrayList<E> comparableList){

    }

}
