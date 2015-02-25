import java.util.*;

public class TextLab13Main {

	public static void main(String[] args) {

		ArrayList<Bank> CustomerDatabase = new ArrayList<Bank>();
		
		
		Bank matt = new Checking("Matthew", "Pearce",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());

		matt.deposit(500.56);

		Bank aleksa = new moneyMarket("Aleksa", "Djeric",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());


		// Add Customer
		CustomerDatabase.add(matt);
		CustomerDatabase.add(aleksa);
		
		
		System.out.println("\n\n\n\n\n" + CustomerDatabase);
	}
}
