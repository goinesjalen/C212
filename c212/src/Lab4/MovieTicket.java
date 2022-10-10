package c212.src.Lab4;

import java.util.Scanner;
public class MovieTicket {

    public static boolean ageRestricted(int age, String rating){
        if(rating.equals("PG13") && age <= 12){
            return true;
        }
        else if(rating.equals("R") && age <= 17){
            return true;
        }
        else{
            return false; //Tip: true means ageRestricted, which means the customer cannot see the movie
        }
    }
    public static int getPrice(int age){
        if(age <=12){
            return 5;
        }
        else if (age <=17){
            return 9;
        }
        else{
            return 12;
        }
    }
    public static void main(String[] args){
       /*
                 2. USING A LOOP, calculate and print either the total cost of the tickets OR print "Age Restricted" if
                 AT LEAST one customer is age restricted.
                 3. Test the functionality of getPrice and ageRestricted using JUnit tests in a separate file.
        */
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rating of the movie.");
        final String rating = sc.nextLine();
        System.out.println("Please enter the number of tickets you would like to purchase.");
        int num = sc.nextInt();
        System.out.println(rating);
        while (num > 0){
            System.out.println("Please enter the age of each of the ticket holders");
            int age = sc.nextInt();
            if (ageRestricted(age, rating) == true){
                System.out.println("Age Restriced.");
                break;
            }
            cost += getPrice(age);
            System.out.println("Current cost is: " + cost);
            --num;
        }
        sc.close();
    }
}
