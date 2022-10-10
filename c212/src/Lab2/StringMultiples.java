package c212.src.Lab2;
import java.util.Scanner;
public class StringMultiples {
    static int multiplier;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input two strings to compare, one at a time, with the single string coming first.");
        String single = sc.nextLine();
        String multiple = sc.nextLine();
        System.out.println(checkIfMultiple(single, multiple));
        System.out.println(checkIfMultiple("aGb", "aGbaGb"));
        System.out.println(checkIfMultiple("a", "a"));
        System.out.println(checkIfMultiple("a", "aa"));
        System.out.println(checkIfMultiple("ab", "aGbab"));
        System.out.println(checkIfMultiple("a", "abab"));
        System.out.println(checkIfMultiple("a", "aaaaAaaaa"));
        sc.close();
    }
    public static boolean checkIfMultiple(String single, String multiple){
        System.out.print(single + " ");
        System.out.print(multiple + " ");
        if(multiple.length() % single.length() == 0){
            //First I need to check that the legnth of Multiple is a multuiple of the length of Single.
            multiplier = multiple.length() / single.length();
            //Then, I'll use division to get the multiplier of the two.
            if (single.repeat(multiplier).equals(multiple)){
                //Lastly, if Single multiplied by the multiplier returns Multiple, it'll return true.
                return true;
            }
            else{
                //Otherwise return false.
                return false;
            }
        }
        else{
            //Otherwise return false. x2
            return false;
        }
    }
}
