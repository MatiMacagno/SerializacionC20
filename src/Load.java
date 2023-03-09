import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Load {

    public static ArrayList<Contacts> loadContacts(ArrayList<Contacts> contacts){

        ArrayList<Contacts> retrievedContacts = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("contacts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            retrievedContacts = (ArrayList<Contacts>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return retrievedContacts;
    }

}
