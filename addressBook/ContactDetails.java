package addressBook;

public class ContactDetails {
	// classBased variables
	protected String firstName, lastName, address, city, state, email;
	protected int zipcode;
	protected long mobNumber;
	
	

	/**
	 * 
	 */
	public ContactDetails() {
		
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param email
	 * @param zipcode
	 * @param mobNumber
	 */
	public ContactDetails(String firstName, String lastName, String address, String city, String state, String email,
			int zipcode, long mobNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zipcode = zipcode;
		this.mobNumber = mobNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the zipcode
	 */
	public int getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the mobNumber
	 */
	public long getMobNumber() {
		return mobNumber;
	}

	/**
	 * @param mobNumber the mobNumber to set
	 */
	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	@Override
	public String toString() {
		return "ContactDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", email=" + email + ", zipcode=" + zipcode + ", mobNumber=" + mobNumber
				+ "]";
	}
	

}
