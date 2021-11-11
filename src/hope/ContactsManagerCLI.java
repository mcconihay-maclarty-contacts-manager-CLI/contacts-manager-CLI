package hope;

import hope.Contact;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ContactsManagerCLI {
	public static void main(String[] args) {
//		Contact contact = new Contact("dog", "Cat");
//		contact = new HashMap<String, String>();
		List<String> contactList = Arrays.asList("Destiney | 2031234567", "Ian | 2105551234");
		System.out.println(contactList);

		boolean confirm = true;
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");;
		CLI cli	= new CLI();
		do {
			Input scan = new Input();
			int option = scan.getInt(
					"\n1 - View contacts" +
							"\n2 - Add a new contact" +
							"\n3 - Search a contact by name" +
							"\n4 - Delete an existing contact" +
							"\n5 - Exit" +
							"\n\n Please select a number option:");
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
					System.out.println("Enter contact name you wish to search: ");
					String searchContact = scanner.next();
					cli.searchByName(searchContact);
					break;
				case 4:

					break;
				case 5:

					break;
				default:
					break;
			}
			confirm = new Input().yesNo("Return to main menu? [y/N]");
		} while (confirm);



		//		Directory path
		String directory = "./src/data";
		Path dataDirectory = Paths.get(directory);

// 		File path
		String filename = "contactInfo.text";

//		Combine them
		Path dataFile = Paths.get(directory, filename);
		System.out.println(dataFile);

//		Creating the Directory
//		if(Files.notExists(dataDirectory)){
//			try {
//				Files.createDirectory(dataDirectory);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		Creating the File
//		if(Files.notExists(dataFile)){
//			try {
//				Files.createFile(dataFile);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
////		}
//	}
}}




