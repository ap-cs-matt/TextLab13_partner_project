
public class Checking extends commonBank{

	public Checking(){
		System.out.println("A Checking Account Was Created\n");
		assignCustomerID();
	}
	public Checking(String firstName, String lastName, int creditScore, String phoneNumber, String SocialSecurity,String adress){

		System.out.println("A Checking Account Was Created\n");
		assignCustomerID();
		tempCustomer.setFirstName(firstName);
		tempCustomer.setLastName(lastName);
		tempCustomer.setPhoneNumber(phoneNumber);
		tempCustomer.setCreditScore(creditScore);
		tempCustomer.setBalance(0.0);
		tempCustomer.setBalance(0.0);
		tempCustomer.setAddress(adress);
		assignAgent();
		setSocialSecurity(SocialSecurity);
		
	}
	
	public void issureCard() {
		// TODO Auto-generated method stub
		
	}

	public void getFutureBalance() { // calculates based on interest
		// TODO Auto-generated method stub
		
	}

	
	public void getWithdrawalPolicy() {
		
		
	}

	
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	
	public void withdraw(int amount) {
			
		tempCustomer.setBalance((tempCustomer.getBalance()- amount));
	}

	public String toString(){
		return tempCustomer.toString();
		
	}

	
	public void assignCustomerID() {
		
		int rand = (int)(Math.random()*1000000)+32343;
		tempCustomer.setCustomerID("CHK-" + rand);
		
	}
}
