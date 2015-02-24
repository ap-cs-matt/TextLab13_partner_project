public class Checking extends commonBank {

	private String withdrawalPolicy = "Withdrawal Policy for Checking: There is no penalalty fir withdrawing money";
	private Double interestRate = .0001;

	public Checking() {
		System.out.println("A Checking Account Was Created\n");
		assignCustomerID();
	}

	public Checking(String firstName, String lastName, int creditScore,
			String phoneNumber, String SocialSecurity, String adress) {

		System.out.println("A Checking Account Was Created\n");
		assignCustomerID();
		assignAgent();
		setSocialSecurity(SocialSecurity);
		tempCustomer.setFirstName(firstName);
		tempCustomer.setLastName(lastName);
		tempCustomer.setPhoneNumber(phoneNumber);
		tempCustomer.setAddress(adress);
		tempCustomer.setCreditScore(creditScore);
		tempCustomer.setBalance(0.0);
	}

	public void issureCard() {
		// TODO Auto-generated method stub

	}

	public Double getFutureBalance(int months) { // calculates based on interest
		
		Double futureBalance;
		futureBalance = tempCustomer.getBalance() + (months * interestRate * tempCustomer.getBalance());
		
		
		return futureBalance;

	}

	public String getWithdrawalPolicy() {

		return withdrawalPolicy;
	}

	public void deposit(Double amount) {
		tempCustomer.setBalance(tempCustomer.getBalance() + amount);

	}

	public void withdraw(int amount) {

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
