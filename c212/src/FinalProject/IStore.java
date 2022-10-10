package c212.src.FinalProject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStore {
    List<Item> getItemsFromFile();
    List<Staff> getStaffFromFile();
    void saveItemsFromFile();
    void saveStaffFromFile();
    void takeAction() throws FileNotFoundException, IOException;
}
