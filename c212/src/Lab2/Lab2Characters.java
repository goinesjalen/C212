package c212.src.Lab2;
import java.util.Scanner;
public class Lab2Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character, followed by an enter.");
        char input = sc.next().charAt(0);
        System.out.println(ascii(input));
        System.out.println("J A N 2 0 2 2 j a v a : D");
        int len = "J A N 2 0 2 2 j a v a : D".length();
        for (int i = 0; i <= len; i++){
            if(i % 2 == 0){
                System.out.print(ascii("J A N 2 0 2 2 j a v a : D".charAt(i)) + " ");
            }
        }
        sc.close();
    }
    public static int ascii(char input){
        return (int)input;
    }
}
