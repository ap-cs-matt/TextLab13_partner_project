public class CD extends commonBank {

	public CD() {

	}

	public void issureCard() {
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

	@Override
	public void getAddress() {
		// TODO Auto-generated method stub

	}

	public void assignCustomerID() {

		int rand = (int) (Math.random() * 1000000) + 32343;
		tempCustomer.setCustomerID("CD-" + rand);

	}

}
