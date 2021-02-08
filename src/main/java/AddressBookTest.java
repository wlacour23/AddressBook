import java.util.Scanner;
public class AddressBookTest {
    public static void main(String[] args) {

        System.out.println("***PROGRAM INFORMATION*** \nNAME" +
                "->  IS THE NAME OF THE PERSON IN THE ADDRESSBOOK \nADDRESS" +
                "->  THE ADDRESS OF THE PERSON \nMOBILE NUMBER" +
                "->  THE MOBILE NUMBER OF THE PERSON \nEMAIL ADDRESS" +
                "->  THE EMAIL ADDRESS OF THE PERSON\n");

        String input;
        Scanner in = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        boolean stop = false;
        do {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Entry");
            System.out.println("2. Delete an Entry");
            System.out.println("3. Search Book for Entry");
            System.out.println("4. Print Address Book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Please enter Choices from 1 to 6: \n");
            input = (in.next());


            switch (input) {
                case "1":
                    //create a new entry for the addressbook
                    AddressBookEntry entry = new AddressBookEntry();

                    System.out.println("***Adding Entry in Address Book***");

                    System.out.print("First Name: ");
                    entry.setName(in.next());

                    System.out.print("Address: ");
                    entry.setAddress(in.next());

                    System.out.print("Mobile Number: ");
                    entry.setMobileNumber(in.nextInt());

                    System.out.print("Email Address: ");
                    entry.setEmailAddress(in.next());

                    //add our new entry to the addressbook
                    addressBook.add(entry);

                    System.out.println("Added a new entry.");
                    break;

                case "2":
                    System.out.println("Enter the index of the entry, which you want to delete:");
                    //delete the entry at the given index
                    addressBook.delete(in.nextInt());

                    break;

                case "3":
                    System.out.println("Your addressbook contains the following entries:");
                    //get array of all entries
                    AddressBookEntry[] listOfEntries = addressBook.viewAll();

                    //for every entry in the array
                    for (int i = 0; i < listOfEntries.length; i++) {
                        System.out.println(listOfEntries[i].toString());
                    }

                    break;
                case "4":
                    System.out.println("Enter the index of the entry, which you want to update:");
                    //get entry at the given index
                    AddressBookEntry entryToUpdate = addressBook.get(in.nextInt());

                    System.out.print("First Name (current: " + entryToUpdate.getName() + "):");
                    entryToUpdate.setName(in.next());

                    System.out.print("Address: (current: " + entryToUpdate.getAddress() + "):");
                    entryToUpdate.setAddress(in.next());

                    System.out.print("Mobile Number: (current: " + entryToUpdate.getMobileNumber() + "):");
                    entryToUpdate.setMobileNumber(in.nextInt());

                    System.out.print("Email Address: (current: " + entryToUpdate.getEmailAddress() + "):");
                    entryToUpdate.setEmailAddress(in.next());

                    break;

                default:
                    break;
            }
            //execute while stop is false
        } while (!input.equals("5"));
        System.out.println("***THANK YOU FOR USING MY PROGRAM...***");
    }
}


