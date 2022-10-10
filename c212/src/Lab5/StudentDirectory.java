package c212.src.Lab5;

import java.util.Scanner;
import java.util.Arrays;

public class StudentDirectory {
    static int[][] students  = {{1, 18, 12,  90},  {2, 16, 10, 75}, {3, 15, 9, 85}};
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the following information:");
        System.out.println("Enter -1 to disregard a filter");
        System.out.println("Minimum Age:");
        int minAge = s.nextInt();
        System.out.println("Minimum Year:");
        int minYear = s.nextInt();
        System.out.println("Minimum Grade:");
        int minGrade = s.nextInt();
        Directory(minAge, minYear, minGrade);
        s.close();
    }
    public static int[] Directory(int minAge, int minYear, int minGrade){
        // Array is as follows : { Student ID, Age, Year, Grade }
        int count = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i][1] < minAge){
                students[i] = null;
            }
        }
        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                if (students[i][2] < minYear){
                    students[i] = null;
                }
            }
        }
        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                if (students[i][3] < minGrade){
                    students[i] = null;
                }
            }
        }
        for (int i = 0; i < students.length; i++){
            if(students[i] != null){
                ++count;
            }
        }
        int[] fin = new int[count];
        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                fin[i] = students[i][0];
            }
        }
        System.out.println(Arrays.toString(fin));
        return fin;
    }
}
