public class moneyMarket extends commonBank {

	final int maxW = 6;
	int timesWdrwn = 0;
	final private Double interestRate = .01;

	public moneyMarket() {
		System.out.println("A Money Market Account Was Created");
		assignCustomerID();
	}

	public moneyMarket(String firstName, String lastName, int creditScore,
			String phoneNumber, String SocialSecurity, String adress) {

		System.out.println("A Money Market Account Was Created");
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

	public Double getFutureBalance(int months) {
		Double futureBalance;
		futureBalance = tempCustomer.getBalance()
				+ (months * interestRate * tempCustomer.getBalance());
		return futureBalance;
	}

	public String getWithdrawalPolicy() {
		System.out
				.println("This account allows you to withdraw your money up to 6 times a month in return for a higher rate of interest.");
		return "";

	}

	public void withdraw(Double amount) {
		if (maxW > timesWdrwn) {
			tempCustomer.setBalance((tempCustomer.getBalance() - amount));
			timesWdrwn++;
			System.out.println("You can withdraw your money "
					+ (6 - timesWdrwn) + " more time(s).");
		} else {
			System.out.println("You can no longer withdraw your money.");
		}

	}

	public void assignCustomerID() {

		int rand = (int) (Math.random() * 1000000) + 32343;
		tempCustomer.setCustomerID("MM-" + rand);
		timesWdrwn++;

	}

	public String toString() {
		return tempCustomer.toString();

	}

	public void issueCard() {

		System.out.println("A card has been issued for customer ID: "
				+ tempCustomer.getCustomerID());

	}

	public void deposit(Double amount) {

		tempCustomer.setBalance(tempCustomer.getBalance() + amount);
		System.out.println("Thank you for your desposit of: $" + amount);
	}

}
