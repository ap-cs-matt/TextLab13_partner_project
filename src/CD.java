public class CD extends commonBank {

	private String withdrawalPolicy = "Withdrawal Policy for Checking: No withdrawals allowed until contract has run out";
	private Double interestRate = .031;

	public CD() {
		System.out.println("A CD Account Was Created");
		assignCustomerID();
	}

	public CD(String firstName, String lastName, int creditScore,
			String phoneNumber, String SocialSecurity, String adress) {

		System.out.println("A CD Account Was Created");
		assignCustomerID();
		assignAgent();
		issueCard();
		setSocialSecurity(SocialSecurity);
		tempCustomer.setFirstName(firstName);
		tempCustomer.setLastName(lastName);
		tempCustomer.setPhoneNumber(phoneNumber);
		tempCustomer.setAddress(adress);
		tempCustomer.setCreditScore(creditScore);
		tempCustomer.setBalance(0.0);
	}

	public void issueCard() {
		System.out.println("A card has been issued for customer ID: "
				+ tempCustomer.getCustomerID());

	}

	public Double getFutureBalance(int months) { // calculates based on interest

		Double futureBalance;
		futureBalance = tempCustomer.getBalance()
				+ (months * interestRate * tempCustomer.getBalance());

		return futureBalance;

	}

	public String getWithdrawalPolicy() {

		return withdrawalPolicy;
	}

	public void deposit(Double amount) {
		System.out
				.println("Your deposit of $" + amount + " has been rejected, the account type CD does not allow for deposits");

	}

	public void withdraw(Double amount) {

		System.out
				.println("Your withdrawal of $" + amount + " has been blocked, the account type CD does not allow for withdrawals");
	}

	public String toString() {
		return tempCustomer.toString();

	}

	public void assignCustomerID() {

		int rand = (int) (Math.random() * 1000000) + 32343;
		tempCustomer.setCustomerID("CD-" + rand);

	}
}
