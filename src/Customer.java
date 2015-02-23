public class Customer {

	// will store all customer info?
	private String firstName;
	private String lastName;
	private Double balance;
	private int creditScore;
	private String socialSecurity;
	private int phoneNumber;
	private String address;

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
		return address;

	}

	public int getPhoneNumber() {
		return creditScore;

	}

	public String getAddress() {
		return address;

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

	public void setPhoneNumber(int phoneNumber) {

		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public String toString() {
		return (("Full Name: " + firstName + " " + lastName) + "\nBalance: "
				+ balance + "\nCredit Score: " + creditScore
				+ "\nSocial Security: " + socialSecurity + "\nAddress: "
				+ address + "\nPhone Number: " + phoneNumber);

	}
}
