package hope;

public class Contact {
	private String name;

	private String number;

	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getContact() {
		return "Contacts Name: "+ this.name + "\nPhone number: " + this.number + "\n";
	}


}
