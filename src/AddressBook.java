import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressBook;

    public AddressBook () {
        addressBook = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b) {
        addressBook.add(b);
    }

    public void removeBuddy(BuddyInfo b) {
        addressBook.remove(b);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        System.out.println("New Line");
        BuddyInfo buddy = new BuddyInfo("Nivetha", "4 the parkway", "6134135364");
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(buddy);
        addressBook1.removeBuddy(buddy);
    }
}
