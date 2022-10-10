package c212.src.Lab2;
//  Lab 2
//
//  Released:  1/27/2021
//
//  @Author Jalen Goines jgoines@iu.edu
//  Last Edited: 1/23/2022
//
//
//  Directions: The given file is not according to java coding guidelines
//              and may have compilation errors to be fixed.
//              Tasks to be performed:
//              1. Edit the file to make it according to java coding guidelines
//              and fix the errors if any.
//              2. Include comments to indicate the changes made to the file
//              to make it according to coding conventions or fix issues.
//
//////////////////////////////////////////////////////////////////////////////



/*

Note: The file is a standalone java file, meaning you can run this file directly.

About the java file: The current Program performs Addition and Subtraction operations.

User Input:
1. choice: User should enter either 1 or 2 depending on which operation the user wants to perform.
2. first_operand, second_operand: The operands on which the addition/subtraction operation is to be performed. These are
   integers.

Expected Program Output:
The correct result for Addition and Subtraction operations

Eg:
Welcome to Addition/Subtraction Calculator:
Choose your operation:
1. Add
2. Subtract
Enter 1 for performing Addition
Enter 2 for performing Subtraction
1
Enter first operand
5
Enter second operand
4
The result of the operation is:
9
*/
import java.util.Scanner;
//Imported Scanner instead of Scan

public class DebugProgramOne
{
    public static void main(String[] args)
    {
//      Intializing operationOne() object
        operationOne obj = new operationOne();
//      Calling class objectOne as obj
//      Initializing Scanner object
        Scanner sc = new Scanner(System.in);
//      Changed Scan to Scanner x2

//      Initializing integer result
        int result = 0;

        System.out.println("Welcome to Addition/Subtraction Calculator:");
        System.out.println("Choose your operation:");
        System.out.println("1. Add\n2. Subtract");
        System.out.println("Enter 1 for performing Addition");
        System.out.println("Enter 2 for performing Subtraction");
        int choice = sc.nextInt();
        System.out.println("Enter first operand");
        int first_operand = sc.nextInt();
        System.out.println("Enter second operand");
//        Taking an int input using Scanner object
        int second_operand = sc.nextInt();
        if(choice==1)
        {
            result = obj.add(first_operand,second_operand);
        }
        else if(choice==2)
//      Changed elif to else if
        {
            result = obj.subtract(first_operand,second_operand);
        }
        System.out.println("The result of the operation is:"+result);
        sc.close();
//      Closed the scanner object (Unnessecary but done to remove a suggestion on IDE.)
    }
}

class operationOne
//Changed operationOne() to operationOne
{
//    function to add 2 integers
    public int add(int first_operand,int second_operand){
//      Changed first_operand to type int and removed static
        return first_operand+second_operand;
    }
//    function to subtract 2 integers
    public int subtract(int first_operand,int second_operand){
//      Changed both operands to type int and removed static
        return first_operand-second_operand;
    }
}