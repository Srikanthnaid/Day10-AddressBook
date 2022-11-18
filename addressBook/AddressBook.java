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

	// added contact to the AddressBook
	public void editContact() {
		System.out.print("Enter First Name:");
		String editName = s.next();
		boolean edited = false;

		for (int i = 0; i < contactlist.size(); i++) {
			String name = contactlist.get(i).getFirstName();
			// Check name == editName.
			if (name.equalsIgnoreCase(editName)) {
				System.out.println("Name is Match  \nnow Edit contact");
				System.out.println(
						"FirstName match  \n ckoose which one you want to change  \n Enter 1 to change firatName  \nEnter 2 to change LastName  \nEnter 3 to change address  \nEnter 4 to change city  \nEnter 5 to change state  \nEnter 6 to change ZipCode  \nEnter 7 to change MobNumber  \nEnter 8 to change E-Mail Address");
				int input = s.nextInt();
				switch (input) {
				case 1:
					System.out.print("Enter firstname: ");
					person.setFirstName(s.next());
					break;
				case 2:
					System.out.print("Enter lastname: ");
					person.setLastName(s.next());
					break;
				case 3:
					System.out.print("Enter Address: ");
					person.setAddress(s.next());
					break;
				case 4:
					System.out.print("Enter City: ");
					person.setCity(s.next());
					break;
				case 5:
					System.out.print("Enter State: ");
					person.setState(s.next());
					break;
				case 6:
					System.out.print("Enter ZipCode: ");
					person.setZipcode(s.nextInt());
					break;
				case 7:
					System.out.print("Enter PhoneNumber: ");
					person.setMobNumber(s.nextLong());
					break;
				case 8:
					System.out.print("Enter E-Mail Address: ");
					person.setEmail(s.next());
					break;
				}

				edited = true;
				break;
			}
		}
		if (!edited) {
			System.out.println("This name does not exist");
		}
	}

	// deleting contact from the addressbook
	public void deleteContact() {
		System.out.println("Enter the first name of person to edit contact");
		String deleteName = s.next();
		boolean deleted = false;
		for (int i = 0; i < contactlist.size(); i++) {
			String name = contactlist.get(i).getFirstName();
			if (name.equalsIgnoreCase(deleteName)) {
				System.out.println("Contact deleting Successfully!");
				contactlist.remove(i);
				printContact();
				deleted = true;
				break;
			}
		}
		if (!deleted) {
			System.out.println("Enter name does not exist");
		}
	}

	// printContact() method using to print the contact Details
	void printContact() {
		System.out.println("Contact Details");
		contactlist.stream().forEach(a -> System.out.println(a));

	}

	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		Scanner userInput = new Scanner(System.in);
		MultipleAddressBooks obj = new MultipleAddressBooks();
		while (true) {
			System.out.println("Enter \n 1. To add The new AddressBook\n 2. To add contact in AddressBook\n "
					+ "3. To edit the contact in AddressBook\n 4. To delete the contact in AddressBook\n 5. To delete the AddressBook\n "
					+ "6. To Print the AddressBook\n 7. To Print the contacts in AddressBook\n 0. to exit");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1 -> obj.addAddressBook();

			case 2 -> obj.addContact();

			case 3 -> obj.editContactInBook();

			case 4 -> obj.deleteContactInBook();

			case 5 -> obj.deleteAddressBook();

			case 6 -> obj.printBook();

			case 7 -> obj.printContactsInBook();

			case 0 -> System.exit(0);

			default -> System.out.println("Enter the wrong input");

			}
		}
	}

}