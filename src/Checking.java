
public class Checking extends commonBank{

	public Checking(){
		System.out.println("A new checking accounts was created");
	}
	
	public void issureCard() {
		// TODO Auto-generated method stub
		
	}

	public void getFutureBalance() {
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
		return null;
		
	}
	
}
