public class savings extends commonBank {

	public savings() {

	}

	public void issueCard() {
		// TODO Auto-generated method stub

	}

	public void getFutureBalance() {
		// TODO Auto-generated method stub

	}

	public String getWithdrawalPolicy() {
		return null;
		// TODO Auto-generated method stub

	}

	public void deposit() {
		// TODO Auto-generated method stub

	}

	public void withdraw(int amount) {
		// TODO Auto-generated method stub

	}

	public void assignCustomerID() {

		int rand = (int) (Math.random() * 1000000) + 32343;
		tempCustomer.setCustomerID("SV-" + rand);

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

	@Override
	public void withdraw(Double amount) {
		// TODO Auto-generated method stub
		
	}

}
