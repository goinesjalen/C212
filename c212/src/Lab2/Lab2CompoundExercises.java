package c212.src.Lab2;
////////////////////////////////////////////////////////////////////////////////////
//  C212
//  Released:  1/19/22
//  Lab 2
//  @Author  Jalen Goines jgoines
//  Last Edited: 1/23/22
//
//  Directions: See Below
//
//////////////////////////////////////////////////////////////////////////////////

class Lab2CompoundExercises {
    public static void main(String args[]){
        differentOperators();
        question2();
    }
	// 1. Review the following method (differentOperators). You will create two new methods, name them as you see fit,
    //    and implement the following changes:
	// 1a. Change differentOperators() to use ONLY simple-assignment operators and not compound. All print statements should print the
    //     same values.
	// 1b. Change differentOperators() to use a post-increment operator each time there used to be a pre-increment operator,
    //     and vice versa. Does this change the result? YES, this changes the result because the operation is done before instead of after, or vise versa.
     public static void differentOperators(){

          int result = 11; // result is 11
          System.out.println(result);

          result = result - 1; // result is now 10
          System.out.println(result);

          result = result / -2; // result is now -5
          System.out.println(result);

          result = result * -20; // result is now 100
          System.out.println(result);

          result = result % 5; // result is now 0
          System.out.println(result);

          ++result; // result is now 1
          System.out.println(result);
     }

// 2. In the following program, using comments in this file, explain why the value "6" is printed thrice in a row:
//    Also, explain why "8" became "6" from line 51 to 52.
     public static void question2() {
        int i = 6;
        ++i; // add one to i(7)
        System.out.println(i);    // "7" print i(7)
        i++; // add one to i(8)
        System.out.println(i--);  // "8" print i(8) then subtract one from i(7)
        System.out.println(--i);  // "6" subtract one from i(6) then print i
        System.out.println(i--);  // "6" print i(6) then subtract one from i(5)
        System.out.println(++i);  // "6" add one to i(6) then print i
     }
}