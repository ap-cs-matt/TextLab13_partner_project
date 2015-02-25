public class Customer {

	// will store all customer info?
	private String firstName;
	private String lastName;
	private Double balance;
	private int creditScore;
	private String socialSecurity;
	private String phoneNumber;
	private String address;
	private String agent;
	private String CustomerID;

	public Customer() {

	}

	public String getFirstName() {
		return firstName;

	}

	public String getLastName() {
		return lastName;

	}

	public Double getBalance() {
		return balance;

	}

	public int getCreditScore() {
		return creditScore;

	}

	public String getSocialSecurity() {
		return socialSecurity;

	}

	public String getPhoneNumber() {
		return phoneNumber;

	}

	public String getAddress() {
		return address;

	}

	public String getAgent() {
		return agent;

	}

	public String getCustomerID() {
		return CustomerID;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public void setBalance(Double balance) {

		this.balance = balance;

	}

	public void setCreditScore(int creditScore) {

		this.creditScore = creditScore;
	}

	public void setSocialSecurity(String socialSecurity) {

		this.socialSecurity = socialSecurity;
	}

	public void setPhoneNumber(String phoneNumber2) {

		this.phoneNumber = phoneNumber2;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public void setAgent(String agent) {
		this.agent = agent;

	}

	public void setCustomerID(String CustomerID) {
		this.CustomerID = CustomerID;
	}

	public String toString() {
		return (("Full Name: " + firstName + " " + lastName) + "\nBalance: $"
				+ balance + "\nCredit Score: " + creditScore
				+ "\nSocial Security: " + socialSecurity + "\nAddress: "
				+ address + "\nPhone Number: " + phoneNumber
				+ "\nCustomer ID: " + CustomerID + "\nAgent: " + agent + "\n\n");

	}
}
