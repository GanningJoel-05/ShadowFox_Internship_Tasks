package ContactManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        System.out.println("\n========== WELCOME TO MY CONTACT MANAGEMENT SYSTEM 🧡 ==========");

        do {
            System.out.println("\n========= MAIN MENU =========");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search Contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option: \n");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.addContact();
                    break;
                case 2:
                    manager.viewContacts();
                    break;
                case 3:
                    manager.updateContact();
                    break;
                case 4:
                    manager.deleteContact();
                    break;
                case 5:
                    manager.searchContact();
                    break;
                case 6:
                    System.out.println("Exiting... 👋");
                    System.out.println("Thanks a lot for using my Contact Management System! ❤️");
                    break;
                default:
                    System.out.println("Invalid choice ❌. Try again.");
            }
        }
        while (choice != 6);
        scanner.close();
    }
}
