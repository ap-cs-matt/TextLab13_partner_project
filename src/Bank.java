public abstract interface Bank {

	public Double getBalance();

	public void getBankInfo();

	public void setBankInfo();

	public void getInsurancePolicy();

	public void getCreditScore();

	public void getAddress();

	public void getBankAccountNum();

	public void getPhoneNum();

	public abstract String getWithdrawalPolicy();

	public abstract Double getFutureBalance(int months); // calculates the future based on
												// the different intersets rates
												// and different parameters

	public void assignAgent();

	public abstract void issureCard();

	public abstract void deposit(Double amount); // has different effect for differiendr
									// accounts

	public abstract void withdraw(Double amount); // some accounts have penalites

	public void assignCustomerID();

}
