package c212.src.Lab4;
import java.util.Random;
import java.util.Scanner;

public class MultiplicationGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int numberToGuess = (rand.nextInt(1, 13) * rand.nextInt(1, 13));
        System.out.println("Please guess the result of two random numbers 1-12");
        int guess = 0;
        int count = 0;
        while (guess != numberToGuess){
            guess = sc.nextInt();
            ++count;
        }
        
        System.out.println("GOT IT! It took you " + count + " tries to get the numder.");
        sc.close();
    }
}
