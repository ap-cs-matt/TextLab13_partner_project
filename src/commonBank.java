
public abstract class commonBank implements Bank{
	
	Customer tempCustomer = new Customer();
	
	public void getBankInfo() {
	}
	public void setBankInfo() {
	}
	public void getInsurancePolicy() {
	}
	public void assignAgent() {
	
		String[] freeAgents = {"Lynne Garrard" ,"Carla Marietta","Rufina Prager","Jarod Wessels","Fannie Klotz","Shonda Peed","Kaila Denardo","Helaine Brittian","Yaeko Labree","Quintin Mundo","Caitlin Ohl"};
		
		int rand = (int)(Math.random()*11);
		
		tempCustomer.setAgent(freeAgents[rand]);
	
	}
	
	public void getCreditScore() {
	}
	public void getAddress() {
	}
	public void getBankAccountNum() {
	}
	public void getPhoneNum() {
	}
	
	public Double getBalance(){ //changing balance is done thorugh withdraw and desposit
	
		return tempCustomer.getBalance();
	}
	
	
	public String getSocialSecurity(){
		
		return tempCustomer.getSocialSecurity();
	}
	public void setSocialSecurity(String socialSecurity){
		
		tempCustomer.setSocialSecurity(socialSecurity);
	}
	
	
	
		
	public abstract void issureCard();
	public abstract void getFutureBalance(); // calculates the future based on the different intersets rates and different parameters
	public abstract void getWithdrawalPolicy();
	public abstract void deposit(); //has different effect for differiendr accounts
	public abstract void withdraw(int amount); // some accounts have penalites

}
