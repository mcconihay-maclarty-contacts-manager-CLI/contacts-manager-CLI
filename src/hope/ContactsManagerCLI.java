package hope;

import hope.Contact;
import util.Input;

public class ContactsManagerCLI {
	public static void main(String[] args) {
		Contact contact = new Contact("dog", "Cat");
		System.out.println(contact);

		boolean confirm = true;
		do {
			Input scanner = new Input();
			int option = scanner.getInt(
					"\n1 - View contacts" +
							"\n2 - Add a new contact" +
							"\n3 - Search a contact by name" +
							"\n4 - Delete an existing contact" +
							"\n5 - Exit" +
							"\n\n Please select a number option:");
			switch (option) {
				case 1:
//						for (Contacts contact : allContacts) {
//							System.out.println("Name: " + contact.getName() + " Number: " + contact.getNumber());
//						}
					break;
				case 2:
					System.out.println(contact.getContact());
					break;
				case 3:

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



//		//		Directory path
//		String directory = "./src/data";
//		Path dataDirectory = Paths.get(directory);
//
//// 		File path
//		String filename = "groceryList.text";
//
////		Combine them
//		Path dataFile = Paths.get(directory, filename);
//		System.out.println(dataFile);
//
////		Creating the Directory
//		if(Files.notExists(dataDirectory)){
//			Files.createDirectory(dataDirectory);
//		}
////		Creating the File
//		if(Files.notExists(dataFile)){
//			Files.createFile(dataFile);
//		}
	}
}




