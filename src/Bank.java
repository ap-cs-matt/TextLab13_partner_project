public abstract interface Bank {

	public Double getBalance();

	public String getBankInfo();

	public String getInsurancePolicy();

	public int getCreditScore();

	public String getAddress();

	public String getPhoneNum();

	public abstract String getWithdrawalPolicy();

	public abstract Double getFutureBalance(int months); // calculates the future based on
												// the different intersets rates
												// and different parameters

	public void assignAgent();

	public abstract void issueCard();

	public abstract void deposit(Double amount); // has different effect for differiendr
									// accounts

	public abstract void withdraw(Double amount); // some accounts have penalites

	public void assignCustomerID();

}
