package c212.src.Lab2;
//  Lab 2
//
//  Released:  1/19/22
//
//  @Author  Jalen Goines jgoines
//  Last Edited: 1/23/22
//
//
//  Directions:  Implement the following methods
//
//
//////////////////////////////////////////////////////////////////////////////////

// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects)
// It is a class that provides functionality and will be used to complete one of the methods
import java.lang.Math;
import java.util.Scanner;
public class Lab2Exercises {
    // computes area of a hexagon when given its side
    public static int areaOfAHexagon(double a) {
      int result = (int)(3 * Math.sqrt(3) * (a * a)) / 2;
      return result;
    }

    // computes perimeter of a hexagon when given its side
    public static int perimeterOfAHexagon(double a) {
      int result = (int)(6 * a);
      return result;
    }

    // Returns the count of character that are vowels in the given String
    // Also print the given string in lowercase. 
    // We suggest using built-in String methods (not a loop).
    // https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html
    public static int countVowels(String str) {
      int initial = str.length();
      str = str.toLowerCase();
      System.out.println(str);
      str = str.replaceAll("[aeiou]", "");
      int end = str.length();
      int difference = initial - end;
      return difference;
    }

    // Use a Scanner to reads a number (integer) that is exactly 5 digits long and print it in reverse
    // for example: 12304 will be printed as 40321. Your solution doesn't need to work for numbers ending in zero(es)
    // or numbers that aren't exactly 5 digits long.
    // You MUST use divide and/or modulus operators and may save part of the number, then concatenate back
    // together as a String and return it.

    public static String reverse5DigitNumber(double usrNumber) {
      double num1 = usrNumber % 10;
      usrNumber = usrNumber - num1;
      num1 = num1 * 10000;

      double num2 = usrNumber % 100;
      usrNumber = usrNumber - num2;
      num2 = num2 * 100;

      double num3 = usrNumber % 1000;
      usrNumber = usrNumber - num3;
      double num4 = usrNumber % 10000;
      usrNumber = usrNumber - num4;
      num4 = num4 / 100;

      double num5 = usrNumber / 10000;

      int end = (int)(num1 + num2 + num3 + num4 + num5);
      return end + "";
    }

    // test client
    public static void main(String[] args) {
      System.out.println("Please choose a program.");
      Scanner sc = new Scanner(System.in);
      System.out.println("1. Area of a hexagon");
      System.out.println("2. Perimeter of a hexagon");
      System.out.println("3. Count Vowesl");
      System.out.println("4. Reverse Five Digit Number");
      int choice = sc.nextInt();
      if (choice == 1){
        System.out.println("Please enter the desired side legnth of your hexagon.");
        double side = sc.nextDouble();
        System.out.println("The area of your hexagon is " + areaOfAHexagon(side));
      }
      if (choice == 2){
        System.out.println("Please enter the desired side legnth of your hexagon.");
        double side = sc.nextDouble();
        System.out.println("The perimeter of your hexagon is " + perimeterOfAHexagon(side));
      }
      if (choice == 3){
        System.out.println("Please enter a string.");
        sc.nextLine();
        String phrase = sc.nextLine();
        System.out.println("Your lowercase string is ");
        int dif = countVowels(phrase);
        System.out.println("There were " + dif + " vowels in your string.");
      }
      if (choice == 4){
        System.out.println("Please enter a five digit number.");
        double input = sc.nextDouble();
        System.out.println("Your backwards number is " + reverse5DigitNumber(input));
      }
      sc.close();
    }
}

////////////////////////////////////
//                                //
// ANSWER THE FOLLOWING QUESTIONS //
//                                //
////////////////////////////////////

/*
 * Questions 1 and 2 are on explicit and implicit casting of some numerical types
 *
 * 1.  What happens if you multipy an int with a char? It will return the ASCII code of the character multiplied by the int.
 *
 * 2.  What happens if you square a char? It will return the ASCII code of the character squared.
 *
 * 3.  What happens if a method has a paramater of type int, but you pass it a char? It will cause an error.
 *
 * 4. What happens if a method has a paramater of type int, but you pass it a float? It will cause an error if the float has a decimal or is outside of the int range.
 * 
 * 5.  What is the difference between float and double in the Java? Floats use much less data than doubles.
 *
 * 6.  Consider the following code snippet.
 *     int i = 25;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 *
 *     Without Compiling the Program:
 *          What {do you think} are the values of i and n if the code is executed?  n is 26 and i is 27
 *          What is the final value printed? 2
 *          Now Compile and Run the Program to check your answers. If they are different, explain why
 *          and provide updated code! When I tried to compile the code I got multiple errors because of the formatting.
 *
 * 7.  If I define a class as below:
 *     class addnumbers {
 *            public static int addOperation(int FirstOperand, int sop){
 *                   return firstOperand+sop;
 *            }
 *            ...
 *     }
 *     Looking at Java Coding Conventions, what suggestions would you give for code refactoring?
 *     I would rename you second operand to secondOperand and your first opperand to firstOperand.
 *
 * 8.  int i = 10000000 * 100000000;
 *	   System.out.println(i);
 *
 *     Why does the code above print a weird answer? How will you fix it (for same computation)?
 *     I would change to using doubles insted of integers because the highest number and integer can take is too small to compute a number that big.
 *
 */
