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
	//added contact to the AddressBook
		public void editContact() {
			System.out.print("Enter First Name:");
			String editName = s.next();
			boolean edited = false;
			
			for (int i = 0; i < contactlist.size(); i++) {
				String name = contactlist.get(i).getFirstName();
				//Check name == editName.
				if (name.equalsIgnoreCase(editName)) {
					System.out.println("Name is Match  \nnow Edit contact");
					System.out.println("FirstName match  \n ckoose which one you want to change  \n Enter 1 to change firatName  \nEnter 2 to change LastName  \nEnter 3 to change address  \nEnter 4 to change city  \nEnter 5 to change state  \nEnter 6 to change ZipCode  \nEnter 7 to change MobNumber  \nEnter 8 to change E-Mail Address");
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

	// printContact() method using to print the contact Details
	void printContact() {
		System.out.println("Contact Details");
		contactlist.stream().forEach(a->System.out.println(a));
				
		
	}
	

	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		Scanner userInput = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to add new contact \nEnter 2 to editContacts \nEnter 3.to printContact \nEnter 4 to Exit");
			int getUserInput = userInput.nextInt();
			switch (getUserInput) {
			case 1 -> book.addContacts();
			case 2 -> book.editContact();
			case 3 -> book.printContact();
			case 4 -> System.exit(0);
			default -> System.out.println("invalid input");
			}
		}
	}

}