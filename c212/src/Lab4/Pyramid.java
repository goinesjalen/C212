package c212.src.Lab4;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a size for you pyramid base... Odd only please.");
        int size = sc.nextInt();
        pyramid(size);
        sc.close();
    }
    public static void pyramid(int size) {
        System.out.println("Printing a pyramid with base " + size);
        int spaceSize = size/2;
        int count = 1;
        while(spaceSize > -1){
            System.out.println(" ".repeat(spaceSize) + "*".repeat(count) + " ".repeat(spaceSize));
            count += 2;
            --spaceSize;
        }
    }
}
