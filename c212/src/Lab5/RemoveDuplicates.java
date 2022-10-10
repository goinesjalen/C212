package c212.src.Lab5;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
    }
    public static int[] removal(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == arr[arr.length - 1]){
                arr[count] = arr[i];
            }
            else if (arr[i] != arr[i+1]){
                arr[count] = arr[i];
                ++count;
            }
        }
        arr = Arrays.copyOf(arr, count + 1);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
