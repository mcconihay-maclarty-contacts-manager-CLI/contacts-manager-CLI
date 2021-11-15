package hope;

import util.Input;
import java.util.*;

public class ContactsManagerCLI {
	public static void main(String[] args) {
		boolean confirm = true;
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");;
		CLI cli	= new CLI();
		do {
			Input scan = new Input();
			int option = scan.getInt(
					"\n1 - View contacts" +
							"\n2 - Add new contact" +
							"\n3 - Search contact by name" +
							"\n4 - Delete existing contact" +
							"\n5 - Exit" +
							"\n\nPlease select a number option:");
			switch (option) {
				case 1:
					cli.allContacts();
					break;
				case 2:
					System.out.print("Enter new contact name: ");
					String newContact = scanner.next();
					System.out.print("Enter new contact number: ");
					String newNumber = scanner.next();
					cli.addContact(newContact, newNumber);
					break;
				case 3:
					System.out.println("Enter contact name to search: ");
					String searchContact = scanner.next();
					cli.searchByName(searchContact);
					break;
				case 4:
					System.out.println("Enter contact name to delete:");
					String delete = scanner.next();
					cli.deleteContact(delete);
					break;
				case 5:
					System.out.println("Are you sure");
					break;
				default:
					break;
			}
			confirm = new Input().yesNo("Return to main menu? [y/N]");
		} while (confirm);
		System.out.println("...Goodbye");

//		https://www.youtube.com/watch?v=ScUJx4aWRi0
}}




