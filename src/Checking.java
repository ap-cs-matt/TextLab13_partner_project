public class Checking extends commonBank {

	private String withdrawalPolicy = "Withdrawal Policy for Checking: There is no penalalty for withdrawing money";
	private Double interestRate = .0001;

	public Checking() {
		System.out.println("A Checking Account Was Created");
		assignCustomerID();
	}

	public Checking(String firstName, String lastName, int creditScore,
			String phoneNumber, String SocialSecurity, String adress) {

		System.out.println("A Checking Account Was Created");
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
		tempCustomer.setBalance(tempCustomer.getBalance() + amount);
		System.out.println("Thank you for your desposit of: $" + amount);

	}

	public void withdraw(Double amount) {

		tempCustomer.setBalance((tempCustomer.getBalance() - amount));
	}

	public void assignCustomerID() {

		int rand = (int) (Math.random() * 1000000) + 32343;
		tempCustomer.setCustomerID("CHK-" + rand);

	}

	public String toString() {
		return tempCustomer.toString();

	}
}
