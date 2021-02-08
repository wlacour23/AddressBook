import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    //The diamond operators "<" and ">" specify which type of Objects the List will hold
    private List<AddressBookEntry> listOfEntries;

    public AddressBook() {
        //initialize list of entries
        this.listOfEntries = new ArrayList<>();
    }

    public void add(AddressBookEntry addressBookEntry) {
        //List.add adds a new Object to a List
        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(int index) {
        //List.remove(int index) removes a object at the given index
        this.listOfEntries.remove(index);
    }

    public AddressBookEntry get(int index) {
        //List.get(int index) returns the object at the given index
        return this.listOfEntries.get(index);
    }

    public AddressBookEntry[] viewAll() {
        //create a new array with the size of our list
        AddressBookEntry[] result = new AddressBookEntry[this.listOfEntries.size()];

        //List.toArray(Arr[] array) fills our array with data from the list
        this.listOfEntries.toArray(result);

        //return the filled array
        return result;
    }
}


