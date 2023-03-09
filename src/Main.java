import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Matias", "matias@gmail.com", 324212347L));
        contacts.add(new Contacts("Daniel", "daniel123@gmail.com", 3247865347L));

        Save.saveContacts(contacts);

        ArrayList<Contacts> retrievedContacts = Load.loadContacts(contacts);
        System.out.println("Retrieved Contacts: ");
        for (Contacts contact : retrievedContacts) {
            System.out.println(contact);
        }
    }
}


