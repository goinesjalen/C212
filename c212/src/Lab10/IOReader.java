package c212.src.Lab10;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
public class IOReader {
    public static void main(String[] args) throws IOException {
        String fileName = "c212\\src\\Lab10\\text\\patients.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("1. Add a patient to file");
        System.out.println("2. Delete a patient from file");
        System.out.println("3. Count the total number of sick or recovered patients");
        System.out.println("4. Sort patients by age");
        System.out.println("5. Sort patiens by first or last name");
        System.out.println("6. Shuffle patients");
        System.out.println("7. Exit");
        int choice = 8;
        while(choice != 7){
            choice = sc.nextInt();
            if(choice == 1){
                sc.nextLine();
                System.out.println("What is the patient's name?");
                String name = sc.nextLine();
                System.out.println("What is the patient's birthdate?");
                String Birth = sc.nextLine();
                addPatient(name, Birth, fileName);
                System.out.println("Patient added succesfully!");
            }
            else if(choice == 2){
                sc.nextLine();
                System.out.println("What is the patient's name?");
                String name = sc.nextLine();
                deletePatient(name, fileName);
                System.out.println("Patient deleted succesfully!");
            }
            else if(choice == 3){
                sc.nextLine();
                System.out.println("What status would you like to count?");
                System.out.println("Please enter 'sick' or 'recover'");
                String status = sc.nextLine();
                System.out.println(countPatients(status, fileName));
            }
            else if(choice == 4){
                sortPatientsByAge(fileName);
                System.out.println("Sorted succesfully!");
            }
            else if(choice == 5){
                sc.nextLine();
                System.out.println("What would you like to sort by?");
                System.out.println("Please enter 'first' or 'last'");
                String firstOrLast = sc.nextLine();
                sortPatientsByName(firstOrLast, fileName);
                System.out.println("Sorted succesfully!");
            }
            else if(choice == 6){
                shufflePatients(fileName);
                System.out.println("Shuffled patients succesfully!");
            }
        }
        sc.close();
    }

    public static String isBirthVaild (int day, int month, int year){
        //check if the given birth is valid.
        if (year > 2022 || year < 1922){
            return "Given day is not valid";
        }
        else{
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if(day <= 31){
                    return "" + month + "/" + day + "/" + year;
                }
                else{ 
                    return "Given day is not valid";
                }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                if(day <= 30){
                    return "" + month + "/" + day + "/" + year;
                }
                else{ 
                    return "Given day is not valid";
                }
            }
            else if(month == 2){
                if(day <= 28){
                    return "" + month + "/" + day + "/" + year;
                }
                else{ 
                    return "Given day is not valid";
                }
            }
            else{
                return "Given day is not valid";
            }
        }
    }

    public static void addPatient (String name, String Birth, String fileName) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(fileName,true));
        String[] dates = Birth.split("/");
        int day = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);
        int month = Integer.parseInt(dates[0]);
        if(isBirthVaild(day, month, year).equalsIgnoreCase(Birth)){
            out.println(name + " " + Birth + " " + "recover");
        }
        else{
            System.out.println(isBirthVaild(day, month, year));
            System.exit(0);
        }
        out.close();
        // Add a new patient record to the file. if given birth is not valid, then patient will not be added into the file.
        // Birth must save in a format of Month/Day/Year, in total length of 10, such as “02/03/2022”, “11/12/2001”, “01/24/1998”, “12/01/1980” and so on. 
    }
    
    public static void deletePatient (String name, String fileName) throws IOException {
        File input = new File(fileName);
        Scanner in = new Scanner(input);
        String[] arrOfName = name.split(" ");
        ArrayList<String> atl = new ArrayList<String>();
        while(in.hasNextLine()){
            String line = in.nextLine();
            String[] arrOfStr = line.split(" ");
            if(arrOfName[0].equalsIgnoreCase(arrOfStr[0]) && arrOfName[1].equalsIgnoreCase(arrOfStr[1]) && arrOfStr[3].equalsIgnoreCase("recover")){
            }
            else{
                atl.add(line);
            }
        }
        PrintWriter out = new PrintWriter(fileName);
        for(int i = 0; i < atl.size(); i++){
            out.println(atl.get(i));
        }
        out.close();
        in.close();
    }
        
    public static int countPatients(String status, String fileName) throws FileNotFoundException {
        File input = new File(fileName);
        Scanner in = new Scanner(input);
        in.useDelimiter("[^A-Za-z]+");
        int count = 0;
        while(in.hasNext()){
            String value = in.next();
            if(value.equalsIgnoreCase(status)){
                count++;
            }
            else if(status.equals("")){
                count++;
            }
        }
        in.close();
        return count;
        // return numbers of sick patients or recovery patients in the file. 
        // if client given “” (empty string), then return the total number of patients. 
        }
        
    public static void averageAge(String fileName) throws FileNotFoundException {
        // find the average age for all patients in the file.
    }  
    
    public static void sortPatientsByAge(String fileName)throws FileNotFoundException {
        ArrayList<String> originalLines = new ArrayList<String>();
        ArrayList<String> newLines = new ArrayList<String>();
        File input = new File(fileName);
        Scanner in = new Scanner(input);
        int originalSize = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            originalLines.add(line);
            originalSize++;
        }
        for(int j = 0; j < originalSize; j++){
            String[][] dates = new String[originalLines.size()][3];
            for(int i = 0; i<originalLines.size(); i++){
                String[] minor = originalLines.get(i).split(" ");
                String[] dmy = minor[2].split("/");
                dates[i] = dmy;
            }
            int minIndex = 0;
            String[] min = dates[0];
            for(int i = 1; i<originalLines.size(); i++){
                if(Integer.parseInt(min[2]) > Integer.parseInt(dates[i][2])){
                    min = dates[i];
                    minIndex = i;
                }
                else if(Integer.parseInt(min[2]) == Integer.parseInt(dates[i][2])){
                    if(Integer.parseInt(min[0]) > Integer.parseInt(dates[i][0])){
                        min = dates[i];
                        minIndex = i;
                    }
                    else if(Integer.parseInt(min[0]) == Integer.parseInt(dates[i][0])){
                        if(Integer.parseInt(min[1]) > Integer.parseInt(dates[i][1])){
                            min = dates[i];
                            minIndex = i;
                        }
                    }  
                }
            }
            newLines.add(originalLines.get(minIndex));
            originalLines.remove(minIndex);
        }
        PrintWriter out = new PrintWriter(fileName);
        for(int i = 0; i < originalSize; i++){
            out.println(newLines.get(i));
        }
        out.close();
        in.close();
        // modify file by sorting patients by age for all patients from young to old 
    }
    
    public static void sortPatientsByName(String firstOrLast, String fileName)throws FileNotFoundException {
        ArrayList<String> originalLines = new ArrayList<String>();
        ArrayList<String> newLines = new ArrayList<String>();
        File input = new File(fileName);
        Scanner in = new Scanner(input);
        int originalSize = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            originalLines.add(line);
            originalSize++;
        }
        String[][] lastNameAccess = new String[originalSize][4];
        if (firstOrLast.equalsIgnoreCase("first")){

            for(int j = 0; j < originalSize; j++){
                String minString = originalLines.get(0);
                int minIndex = 0;
                for(int i = 1; i < originalLines.size(); i++){
                    if((int)minString.charAt(0) - (int)originalLines.get(i).charAt(0) > 0){
                        minIndex = i;
                        minString = originalLines.get(i);
                    }
                    else if((int)minString.charAt(0) - (int)originalLines.get(i).charAt(0) == 0){
                        if((int)minString.charAt(1) - (int)originalLines.get(i).charAt(1) > 0){
                            minIndex = i;
                            minString = originalLines.get(i);
                        }
                        else if((int)minString.charAt(1) - (int)originalLines.get(i).charAt(1) == 0){
                            if((int)minString.charAt(2) - (int)originalLines.get(i).charAt(2) > 0){
                                minIndex = i;
                                minString = originalLines.get(i);
                            }
                        }
                    }
                }
                newLines.add(originalLines.get(minIndex));
                originalLines.remove(minIndex);
            }
        }
        else{
            for(int j = 0; j < originalSize; j++){
                for (int i = 0; i < originalLines.size(); i++){
                    lastNameAccess[i] = originalLines.get(i).split(" ");
                }
                String minString = lastNameAccess[0][1];
                int minIndex = 0;
                for(int i = 1; i < originalLines.size(); i++){
                    if((int)minString.charAt(0) - (int)lastNameAccess[i][1].charAt(0) > 0){
                        minIndex = i;
                        minString = lastNameAccess[i][1];
                    }
                    else if((int)minString.charAt(0) - (int)lastNameAccess[i][1].charAt(0) == 0){
                        if((int)minString.charAt(1) - (int)lastNameAccess[i][1].charAt(1) > 0){
                            minIndex = i;
                            minString = lastNameAccess[i][1];
                        }
                        else if((int)minString.charAt(1) - (int)lastNameAccess[i][1].charAt(1) == 0){
                            if((int)minString.charAt(2) - (int)lastNameAccess[i][1].charAt(2) > 0){
                                minIndex = i;
                                minString = lastNameAccess[i][1];
                            }
                        }
                    }
                }
                newLines.add(originalLines.get(minIndex));
                originalLines.remove(minIndex);
            }
        }
        PrintWriter out = new PrintWriter(fileName);
        for(int i = 0; i < originalSize; i++){
            out.println(newLines.get(i));
        }
        out.close();
        in.close();
        // modify file by sorting patients by first name or last name for all patients from a~z
    }

    public static void shufflePatients(String fileName)throws FileNotFoundException {
        ArrayList<String> originalLines = new ArrayList<String>();
        ArrayList<Integer> chosen = new ArrayList<Integer>();
        File input = new File(fileName);
        Scanner in = new Scanner(input);
        Random rand = new Random();
        int originalSize = 0;
        while(in.hasNextLine()){
            String line = in.nextLine();
            originalLines.add(line);
            originalSize++;
        }
        ArrayList<String> newLines = new ArrayList<String>(originalSize);
        for(int i = 0; i < originalSize; i++){
            int num = rand.nextInt(originalSize);
            while(chosen.contains(num)){
                num = rand.nextInt(originalSize);
            }
            chosen.add(num);
            newLines.add(originalLines.get(num));
        }
        PrintWriter out = new PrintWriter(fileName);
        for(int i = 0; i < originalSize; i++){
            out.println(newLines.get(i));
        }
        in.close();
        out.close();
        // modify file by shuffle all patients, so they are not in any order 
        // Using random in this method is required. 
    } 
    
}
