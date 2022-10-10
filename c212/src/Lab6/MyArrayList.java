package c212.src.Lab6;
import java.util.Arrays;

public class MyArrayList {
    private int size;
    private int[] data;
    
    public MyArrayList(){
        size = 0;
        data = new int[4];
    }
    public MyArrayList(int[] arr){
        size = arr.length;
        data = arr;
    }
    public void add (int n) {
        if(data.length == size){
            int[] newArr = Arrays.copyOf(data, data.length + 1);
            data = newArr;
        }
        data[size] = n;
        size++;
    }
    public void remove (int index){
        if (index < 0 || index >= size){
            System.out.println("Invalid Index Value!");
        }
        else {
            for (int i = index; i <size - 1; i++){
                data[i] = data[i + 1];
            }
        size--;
        }
    }
    public String toString(){
        String str = "[";
        for (int index = 0; index < size; index++){
            str += data[index];
            if (index < size - 1){
                str += ", ";
            }
            else if (index == size - 1){
                str += "]";
            }
        }
        return str;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean contains(int n){
        for (int index = 0; index < size; index++){
            if (data[index] == n){
                return true;
            }
        }
        return false;
    }
    public int indexOf (int n) {
        for (int index = 0; index < size; index++){
            if (data[index] == n){
                return index;
            }
        }
        return -1;
    }
    
}
