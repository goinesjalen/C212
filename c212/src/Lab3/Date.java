package c212.src.Lab3;

import java.lang.Math;

public class Date {
    private String date;

    // Constructors for Date
    public Date(){
        this.date = "";
    }

    public Date(String date){
        this.date = date;
    }

    // Getters for Date, Month, Day, Year
    public String getDate(){
        return date;
    }

    public int getMonth(){
        return Integer.parseInt(this.date.substring(0,2));
    }

    public int getDay(){
        return Integer.parseInt(this.date.substring(3,5));
    }

    public int getYear(){
        return Integer.parseInt(this.date.substring(6));
    }

// Setters for Date, Month, Day, Year
    public void setDate(String date){
        this.date = date;
    }

    public void setMonth(String month){
        this.date = month + this.date.substring(2);
    }

    public void setDay(String day){
        this.date = this.date.substring(0, 3) + day + this.date.substring(5);
    }

    public void setYear(String year){
        this.date = this.date.substring(0, 6) + year;
    }

// Calculates the diffrence between two dates. 
    public int getDifferent(Date Date){
        int dif = 0;

        dif += (this.getYear() - Date.getYear()) * 365;
        dif += (this.getMonth() - Date.getMonth()) * 30;
        dif += (this.getDay() - Date.getDay());

        return Math.abs(dif);
    }
}

/*

#############################
TESTING AREA
#############################

class Doge{
    public static void main(String[] args) {
        Date myObj = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date with the format MM/DD/YYYY");
        String date = sc.nextLine();
        myObj.setDate(date);
        System.out.println(myObj.getDate());

        System.out.println("Enter a month with the format MM");
        String month = sc.nextLine();
        myObj.setMonth(month);
        System.out.println(myObj.getDate());

        System.out.println("Enter a day with the format DD");
        String day = sc.nextLine();
        myObj.setDay(day);
        System.out.println(myObj.getDate());

        System.out.println("Enter a year with the format YYYY");
        String year = sc.nextLine();
        myObj.setYear(year);
        System.out.println(myObj.getDate());

        sc.close();
    }
}

*/