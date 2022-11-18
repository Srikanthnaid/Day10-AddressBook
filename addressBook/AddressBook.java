package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	List<ContactDetails> contactlist = new ArrayList<ContactDetails>();
	ContactDetails person = new ContactDetails();
	static Scanner s = new Scanner(System.in);

	void addContacts() {
	
		System.out.print("Enter First Name : ");
		person.setFirstName(s.next());
		System.out.print("Enter Last Name : ");
		person.setLastName(s.next());
		System.out.print("Enter Address : ");
		person.setAddress(s.next());
		System.out.print("Enter City : ");
		person.setCity(s.next());
		System.out.print("Enter State : ");
		person.setState(s.next());
		System.out.print("Enter ZipCode : ");
		person.setZipcode(s.nextInt());
		System.out.print("Enter Mobile Number : ");
		person.setMobNumber(s.nextLong());
		System.out.print("Enter EmailId : ");
		person.setEmail(s.next());
		contactlist.add(person);
		printContact();
	}

	// printContact() method using to print the contact Details
	void printContact() {
		System.out.println("Contact Details");
		contactlist.stream().forEach(a->System.out.println(a));
				
		
	}
	

	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to add new contact  \nEnter 2.to printContact \nEnter 3 to Exit");
			int getUserInput = userInput.nextInt();
			switch (getUserInput) {
			case 1 -> book.addContacts();
			case 2 -> book.printContact();
			case 3 -> System.exit(0);
			default -> System.out.println("invalid input");
			}
		}
	}

}