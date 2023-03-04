package addressbook.services;

import java.util.ArrayList;
import java.util.Scanner;

import addressbook.interfaces.InterfaceAddressBook;
import addressbook.model.Contacts;
import addressbook.utility.SelfFileHandling;

public class ImplementationsOfAddressBook implements InterfaceAddressBook{

	private static Scanner getDetailInput = new Scanner(System.in);
	SelfFileHandling selHandling = new SelfFileHandling();				//file_handling
	
	public void welcomeDisplay() {
		System.err.println("===================================");
		System.out.println("  ::  Welcome To Address_Book  ::  ");
		System.err.println("==================================="+'\n');
		
	}

	public int createContactDetails(Contacts contacts) {
		System.out.println(" List of All the Contscts ");
		return selHandling.writeFile(contacts);				//file_handling
	}

		public void showAllContacts() {
			System.out.println("*************** : All Available Contacts- : ***************");
			selHandling.readFile();				//file_handling
		}
		
		
}
