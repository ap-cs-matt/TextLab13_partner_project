
public abstract class commonBank implements Bank{
	
	Customer tempCustomer = new Customer();
	
	public void getBankInfo() {
	}
	public void setBankInfo() {
	}
	public void getInsurancePolicy() {
	}
	public void assignAgent() {
	}
	
	public void getCreditScore() {
	}
	public void getAddress() {
	}
	public void getBankAccountNum() {
	}
	public void getPhoneNum() {
	}
	public void getBalance(){
		
	}
	public void getSocialSecurity(){
		
	}
	
	
	
	
		
	public abstract void issureCard();
	public abstract void getFutureBalance(); // calculates the future based on the different intersets rates and different parameters
	public abstract void getWithdrawalPolicy();
	public abstract void deposit(); //has different effect for differiendr accounts
	public abstract void withdraw(); // some accounts have penalites

}
