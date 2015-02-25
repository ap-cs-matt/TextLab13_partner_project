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
		
		int i = (int) (Math.random()*5) + 1;
		while (i < i){
		
		customer.deposit(Math.random() *100000);
		i++;
		}
		
		
		//random withdrawal 
		
		int k = (int) (Math.random()*5) + 1;
		while (i < k){
		
		customer.withdraw(Math.random() *5000);
		i++;
		}
		
		
		
		//get future balance
		
		customer.getFutureBalance((int)(Math.random()*12)+1);
		
		//withdraw
		
		
	}
}


