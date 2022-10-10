package c212.src.Midterm;

import java.util.Scanner;

public class IntBreak{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int input = sc.nextInt();

String num = "" + input;

String end = "" + num.charAt(0);

for(int i=1; i < String.valueOf(input).length(); i++){

end += " " + num.charAt(i);

}

System.out.println(end);
sc.close();
}

}