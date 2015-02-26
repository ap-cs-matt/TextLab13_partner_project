import java.util.UUID;

public class DataGenerator {

	public static String generateSocialSecurity() {

		return UUID.randomUUID().toString();

	}

	public static String generatePhoneNumber() {

		return ((int) (Math.random() * 900) + 100) + "-"
				+ ((int) (Math.random() * 900) + 100) + "-"
				+ ((int) (Math.random() * 9000) + 1000);

	}

	public static String generateAddress() {

		String[] streetTypes = { "St.", "Dr.", "Ln.", "Ct.", "Rd.", "Ave." };
		String[] streetNames = { "Linden", "Cherry", "Maple", "Andover",
				"Grove", "Main", "Garden" };

		return ((int) (Math.random() * 999) + 1) + " "
				+ streetNames[((int) (Math.random() * 7))] + " "
				+ streetTypes[((int) (Math.random() * 6))];
	}

	public static int generateCreditScore() {
		return (int) ((Math.random() * 300) + 500);
	}


	public static void simulateBankActivity(Bank customer){
		
		//random deposit
		
		customer.deposit((Math.random()*20000) + 100);

		
		
		//random withdrawal 
		
		customer.withdraw((Math.random()*8000) + 100);
		customer.withdraw((Math.random()*8000) + 100);
		
		
		//get future balance
		
		int k = 0;
		while(k<2){
		int months = (int)(Math.random()*12)+1;
		System.out.println( "Your balance in " + months + " months will be: $" + customer.getFutureBalance(months));
		Double InterestGained = customer.getFutureBalance(months) - customer.getBalance();
		System.out.println("The interest Gained is: $" + InterestGained);
		k++;
		}
		
		//withdraw
		customer.getWithdrawalPolicy();
		
		System.out.println("\n");
	}
}


