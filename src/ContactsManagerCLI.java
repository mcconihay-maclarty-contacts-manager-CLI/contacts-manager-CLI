import util.Input;

import java.util.*;
public class ContactsManagerCLI {
	private String name;
	//private String lastName;
	private String number;

	public ContactsManagerCLI(String name, String number) {
		this.name = name;
		this.number = number;
	}

	//	Getters
	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	//	Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}


		void allContacts(){

		}

		void addContact(String name) {

		}

		void deleteContact(String number) {

		}

		void searchByName() {

		}

		void showMenu() {
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
						for (Contacts contact : allContacts) {
							System.out.println("Name: " + contact.getName() + " Number: " + contact.getNumber());
						}
						break;
					case 2:

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






	}
}




