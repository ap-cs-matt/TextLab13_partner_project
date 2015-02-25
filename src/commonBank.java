import java.util.*;

public abstract class commonBank implements Bank {

	Customer tempCustomer = new Customer();

	public String getBankInfo() {
		return null;
	}

	public String setBankInfo() {
		return null;
	}

	public String getInsurancePolicy() {
		return null;
	}

	public void assignAgent() {

		String[] freeAgents = { "Lynne Garrard", "Carla Marietta",
				"Rufina Prager", "Jarod Wessels", "Fannie Klotz",
				"Shonda Peed", "Kaila Denardo", "Helaine Brittian",
				"Yaeko Labree", "Quintin Mundo", "Caitlin Ohl" };

		int rand = (int) (Math.random() * 11);

		tempCustomer.setAgent(freeAgents[rand]);

	}

	public String getCreditScore() {
		return null;

	}

	public String getAddress() {
		return null;

	}

	public String getBankAccountNum() {
		return null;

	}

	public String getPhoneNum() {
		return null;

	}

	public Double getBalance() { // changing balance is done thorugh withdraw
									// and desposit

		return tempCustomer.getBalance();
	}

	public String getSocialSecurity() {

		return tempCustomer.getSocialSecurity();
	}

	public void setSocialSecurity(String socialSecurity) {

		tempCustomer.setSocialSecurity(socialSecurity);
	}

	public String generateSocialSecurity() {

		return UUID.randomUUID().toString();

	}

	public abstract void assignCustomerID();

	public abstract void issueCard();

	public abstract Double getFutureBalance(int months); // calculates the future based on
												// the different intersets rates
												// and different parameters

	public abstract String getWithdrawalPolicy();

	public abstract void deposit(Double amount); // has different effect for differiendr
									// accounts

	public abstract void withdraw(Double amount); // some accounts have penalites

}
