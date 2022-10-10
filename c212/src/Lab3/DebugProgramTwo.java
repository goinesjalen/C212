package c212.src.Lab3;

//  Lab 3
//
//  Released:  9/8/2021
//
//  @Author  Jalen Goines jgoines
//  Last Edited: 1/27/2022
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

Note: The file is a standalone java file, meaning you can run this file directly without having to set up the other 2 files.

About the java file: The current Program computes Area of different shapes based on user input.

User Input: 
1. choice: User should enter either 1 or 2 depending on which shape the user wants to compute area for.
2. base, height for triangle and radius for circle: The lengths of shapes for which areas must be computed.

Expected Program Output:
The correct result for this program

Eg: 

Find area of 
1 . Triangle 
2 . Circle 
Select a choice : 1
Enter the length of base : 
2
Enter the length of height : 
2
Area of triangle with length of sides 2 and 2 is : 2
*/
import java.io.*;
import java.util.Scanner;
// imported scanner for inputs

class DebugProgramTwo {
   public void findarea(int a, int b) {
      // added types to a and b
      int area = (int)(.5 * a * b);
      // changed the formula for area of a triangle
      // added a type to variable area
      System.out.println("\n Area of triangle with length of sides " + a + " and " + b + " is : " + area);
   }

   void findarea(int a) {
      System.out.println("\n Area of circle with  radius " + a + " is :" + 3.14 * Math.pow(a, 2));
   }

   public static void main(String p[]) throws IOException {
      // added static to method
      DebugProgramTwo d = new DebugProgramTwo();
      Scanner keyBoard = new Scanner(System.in);
      // declared keyboard as a scanner class
      System.out.print("\n Find area of \n 1 . Triangle \n 2 . Circle \n\nSelect a choice : ");
      int choice = keyBoard.nextInt();
      // added a type to vairable choice

      if (choice == 1) {
         System.out.print("\n Enter the length of base : ");
         int x = keyBoard.nextInt();
         // inserted a space between int and x
         System.out.print("\n Enter the length of height : ");
         int y = keyBoard.nextInt();
         // added a type to y
         d.findarea(x, y);

      } else if (choice == 2) {
         System.out.print("\n Enter the radius : ");
         int r = keyBoard.nextInt();
         // added a type to r
         d.findarea(r);
         // changed to the appropriate tag for DebugProgramTwo
      } else {
         System.out.println("Invalid choice");
      }
      keyBoard.close();
   }
}
