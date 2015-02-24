public class moneyMarket extends commonBank {

	
	final int maxW = 6;
	int timesWdrwn = 0;
	public moneyMarket() {
		System.out.println("A Money Market Account Was Created\n");
		assignCustomerID();
	}
	public moneyMarket(String firstName, String lastName, int creditScore,
			String phoneNumber, String SocialSecurity, String adress) {

		System.out.println("A Money Market Account Was Created\n");
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
	
	
	public void issueCard() {
		// TODO Auto-generated method stub

	}

	public void getFutureBalance() {
		// TODO Auto-generated method stub

	}

	public String getWithdrawalPolicy() {
		System.out.println("");
		return "";

	}

	public void deposit() {
		// TODO Auto-generated method stub

	}

	public void withdraw(Double amount) {
		if (maxW > timesWdrwn)
		{
		tempCustomer.setBalance((tempCustomer.getBalance() - amount));
		timesWdrwn++;
		System.out.println("You can withdraw your money" + (6-timesWdrwn) + "more time(s).");
		}
		else
		{
		System.out.println("You can no longer withdraw your money.");	
		}
		
	}

	
	public void getAddress() {
		// TODO Auto-generated method stub

	}

	public void assignCustomerID() {
		
		int rand = (int) (Math.random() * 1000000) + 32343;
		tempCustomer.setCustomerID("MM-" + rand);
		timesWdrwn++;
		
	}
	
	public String toString() {
		return tempCustomer.toString();

	}

	@Override
	public void issureCard() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Double getFutureBalance(int months) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deposit(Double amount) {
		// TODO Auto-generated method stub
		
	}

}
