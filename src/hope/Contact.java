package hope;

 class Contact {
	private String name;

	private String number;

	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
//	Setters
	public void addName(String name) {
		this.name = name;
	}

	public void addNumber(String number) {
		this.number = number;
	}

	// getters
	public String getName() {
		return this.name;
	}

	public String getNumber() {
		return this.number;
	}


}
