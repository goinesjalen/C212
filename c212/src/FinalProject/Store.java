package c212.src.FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Store implements IStore {

    @Override
    public List<Item> getItemsFromFile() {
        // TODO
        return null;
    }

    @Override
    public List<Staff> getStaffFromFile() {
        // TODO
        return null;
    }

    @Override
    public void saveItemsFromFile() {
        // TODO
        
    }

    @Override
    public void saveStaffFromFile() {
        // TODO
        
    }

    @Override
    public void takeAction() throws FileNotFoundException, IOException{
        File inputFile = new File("c212\\src\\FinalProject\\input.txt");
        Scanner inpScanner = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(new FileWriter("c212\\src\\FinalProject\\output.txt",true));
        inpScanner.useDelimiter(" ");
                while(true){
                    String task = inpScanner.next();
                    if (task.equalsIgnoreCase("add")){
                        PrintWriter invOut = new PrintWriter(new FileWriter("c212\\src\\FinalProject\\inventory.txt",true));
                        String str = inpScanner.next();
                        String next =  inpScanner.next();
                        while(next.matches(".*[a-z].*")){
                            str += " " + next;
                            next = inpScanner.next();
                        }
                        invOut.println(str + "," + inpScanner.next() + "," + inpScanner.next() + "," + inpScanner.next());
                        out.println(str.substring(1, str.length() - 1) + " was added to inventory.");
                    }
                    if (task.equalsIgnoreCase("cost")){
                        File inventoryFile = new File("c212\\src\\FinalProject\\inventory.txt");
                        Scanner invScanner = new Scanner(inventoryFile);
                        String str = inpScanner.next();
                        String next =  inpScanner.next();
                        while(next.matches(".*[a-z].*")){
                            str += " " + next;
                            next = inpScanner.next();
                        }
                        while (invScanner.hasNextLine()){
                            String line = invScanner.nextLine();
                            String[] words = line.split(",");
                            if(words[0].equalsIgnoreCase(str)){
                                out.println(str.substring(1, str.length() - 1) + ": $" + words[1]);
                            }
                        }
                    }
                    if (task.equalsIgnoreCase("exit")){
                        out.println("Thank you for visiting High's Hardware and Gardening!");
                        System.out.println("Press enter to continue...");
                        Scanner userInput = new Scanner(System.in);
                        String inp = userInput.nextLine();
                        if (inp != null){
                            userInput.close();
                            System.exit(0);
                        }
                    }
                    if (task.equalsIgnoreCase("find")){
        
                    }
                    if (task.equalsIgnoreCase("fire")){
                        File employ = new File("c212\\src\\FinalProject\\staff_availability_IN.txt");
                        Scanner originalEmployeeScanner = new Scanner(employ);
                        ArrayList<String> atl = new ArrayList<String>();
                        String str = inpScanner.next();
                        String next =  inpScanner.next();
                        Boolean tf = false;
                        while(next.matches(".*[a-z].*")){
                            str += " " + next;
                            next = inpScanner.next();
                        }
                        while(originalEmployeeScanner.hasNextLine()){
                            String line = originalEmployeeScanner.nextLine();
                            if (line.contains(str.substring(1,str.length() - 1))){
                                tf = true;
                            }
                            else{
                                atl.add(line);
                            }
                        }
                        PrintWriter staff = new PrintWriter("c212\\src\\FinalProject\\staff_availability_IN.txt");
                        if (tf = true){
                            for(int i = 0; i < atl.size(); i++){
                                staff.println(atl.get(i));
                            }
                            out.println(str.substring(1, str.length() - 1) + " was fired");
                        }
                        else{
                            out.println("ERROR: " + str.substring(1, str.length() - 1) + " cannot be found");
                        }
                        staff.close();
                        originalEmployeeScanner.close();
                    }
                    if (task.equalsIgnoreCase("hire")){
                        PrintWriter toStaff = new PrintWriter(new FileWriter("c212\\src\\FinalProject\\staff_availability_IN.txt",true));
                        String str = inpScanner.next();
                        String next =  inpScanner.next();
                        while(next.matches(".*[a-z].*")){
                            str += " " + next;
                            next = inpScanner.next();
                        }
                        toStaff.println(str.substring(1, str.length() - 1) + " " + next + " " + inpScanner.next() + "M.T.W.TR.F.SAT.SUN");
                        out.println(x);;
                    }
                    if (task.equalsIgnoreCase("promote")){
                        File employ = new File("c212\\src\\FinalProject\\staff_availability_IN.txt");
                        Scanner originalEmployeeScanner = new Scanner(employ);
                        ArrayList<String> atl = new ArrayList<String>();
                        String str = inpScanner.next();
                        String next =  inpScanner.next();
                        int count = 0;
                        int saved = 0;
                        while(next.matches(".*[a-z].*")){
                            str += " " + next;
                            next = inpScanner.next();
                        }
                        while(originalEmployeeScanner.hasNextLine()){
                            String line = originalEmployeeScanner.nextLine();
                            if(line.contains((str.substring(1, str.length() - 1)))){
                                saved = count;
                            }
                            atl.add(line);
                            count++;
                        }
                        String promotion = inpScanner.next();
                        String[] splitstring = atl.get(saved).split(" ");
                        splitstring[3] = promotion;
                        String end = splitstring[0];
                        for (int i = 1; i < splitstring.length; i++){
                            end += " " + splitstring[i];
                        }
                        atl.set(saved, end);
                        PrintWriter staff = new PrintWriter("c212\\src\\FinalProject\\staff_availability_IN.txt");
                        for(int i = 0; i < atl.size(); i++){
                            staff.println(atl.get(i));
                        }
                        if (promotion.equalsIgnoreCase("m")){
                            promotion = "manager";
                        }
                        else if (promotion.equalsIgnoreCase("c")){
                            promotion = "cashier";
                        }
                        else if (promotion.equalsIgnoreCase("g")){
                            promotion = "gardening expert";
                        }
                        out.println(str.substring(1, str.length() - 1) + " was promoted to " + promotion);
                        staff.close();
                        originalEmployeeScanner.close();
                    }
                    if (task.equalsIgnoreCase("saw")){
        
                    }
                    if (task.equalsIgnoreCase("schedule")){
        
                    }
                    if (task.equalsIgnoreCase("sell")){
        
                    }
                    if (task.equalsIgnoreCase("quantity")){
                        File inventoryFile = new File("c212\\src\\FinalProject\\inventory.txt");
                        Scanner invScanner = new Scanner(inventoryFile);
                        String str = inpScanner.next();
                        String next =  inpScanner.next();
                        while(next.matches(".*[a-z].*")){
                            str += " " + next;
                            next = inpScanner.next();
                        }
                        while (invScanner.hasNextLine()){
                            String line = invScanner.nextLine();
                            String[] words = line.split(",");
                            if(words[0].equalsIgnoreCase(str)){
                                out.println(words[2]);
                            }  
                        }
                        invScanner.close();
                    }
                }
            }
            
}
