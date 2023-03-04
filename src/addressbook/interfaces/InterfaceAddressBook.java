package addressbook.interfaces;

import addressbook.model.Contacts;

public interface InterfaceAddressBook {

	void welcomeDisplay();
	int createContactDetails(Contacts contacts);
	void showAllContacts();
}
