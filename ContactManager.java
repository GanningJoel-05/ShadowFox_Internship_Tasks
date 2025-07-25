package ContactManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    private final ArrayList<Contact> contactList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.println("\n===== ADD CONTACTS =====");
        System.out.println("Enter the contact details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Email ID: ");
        String email = scanner.nextLine();

        contactList.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully! ✅");
    }

    public void viewContacts() {
        System.out.println("\n===== VIEW CONTACTS =====");
        if (contactList.isEmpty()) {
            System.out.println("No Contacts to Display! ⚠️");
        }
        else {
            for (Contact c : contactList) {
                c.displayContact();
            }
        }
    }

    public void updateContact() {
        System.out.println("\n===== UPDATE CONTACTS =====");
        System.out.print("Enter the name of the contact to update: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Contact c : contactList) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.print("New Name: ");
                c.setName(scanner.nextLine());
                System.out.print("New Phone Number: ");
                c.setPhoneNumber(scanner.nextLine());
                System.out.print("New Email ID: ");
                c.setEmail(scanner.nextLine());
                System.out.println("Contact Updated Successfully! ✅");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, the Contact not found! ❌");
        }
    }

    public void deleteContact() {
        System.out.println("\n===== DELETE CONTACTS =====");
        System.out.print("Enter the name of the contact to delete: ");
        String name = scanner.nextLine();
        boolean removed = contactList.removeIf(c -> c.getName().equalsIgnoreCase(name));

        if (removed) {
            System.out.println("Contact Deleted! ✅");
        } else {
            System.out.println("Contact not found! ❌");
        }
    }

    public void searchContact() {
        System.out.println("\n===== SEARCH CONTACTS =====");
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Contact c : contactList) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.displayContact();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found! ❌");
        }
    }
}
