import util.Input;

public class CLI {


	public void allContacts(){

	}

	public void addContact(String name) {

	}

	public void deleteContact(String number) {

	}

	public void searchByName() {

	}

	public void showMenu() {
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
