package lesson11;

class PersonItem {
	private String mail_id; // Person E_Mail-id-Key
	private String name; // Name of the person

	public PersonItem(String mail_id, String name) {
		
		this.mail_id = mail_id;
		this.name = name;
	}
	
	// --------------------------------------------------------------
	public String getKey() {
		return this.mail_id;
	}

	public String getValue() {
		return this.name;
	}
	// --------------------------------------------------------------

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

