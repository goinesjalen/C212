package c212.src.Lab4;

import java.util.Random;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        char selection = 'Z';
        while(selection != 'E'){
            System.out.println("Please select an option form the menu below.");
            System.out.println("A. Pattern A");
            System.out.println("B. Pattern B");
            System.out.println("C. Pattern C");
            System.out.println("D. Pattern D");
            System.out.println("E. Exit");
            int size = rand.nextInt(3, 11);
            selection = sc.nextLine().charAt(0);
            if (selection == 'A'){
                patternA(size);
            }
            else if (selection == 'B'){
                patternB(size);
            }
            else if (selection == 'C'){
                patternC(size);
            }
            else if (selection == 'D'){
                patternD(size);
            }
            else if (selection == 'E'){
                System.out.println("Exiting...");
            }
        }
        sc.close();
    }
    public static void patternA(int size) {
        int count = 0;
        System.out.println("Printing pattern A with size " + size + "...");
        while(size > 0){
            System.out.println(" ".repeat(count) + "*".repeat(size));
            count++;
            size--;
        }
    }
    public static void patternB(int size){
        System.out.println("Printing pattern B with size " + size + "...");
        final int original = size;
        String originalstr = "" + size;
        while(size > 0){
            System.out.println(" ".repeat(original - size) + originalstr);
            --size;
        }
        ++size;
        while(size < original){
            System.out.println(" ".repeat(original - size - 1) + originalstr);
            ++size;
        }
    }
    public static void patternC(int size){
        int count = 0;
        while (count <= size){
            System.out.println((count + "").repeat(count));
            ++count;
        }
    }
    public static void patternD(int size){
        while (size > 0){
            System.out.println((size + "").repeat(size));
            --size;
        }
    }
}