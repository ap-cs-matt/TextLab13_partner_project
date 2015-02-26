import java.util.*;

//Group Members: Matthew Pearce, Aleksa Deric, Alex Sun

public class TextLab13Main {

	public static void main(String[] args) {

		ArrayList<Bank> CustomerDatabase = new ArrayList<Bank>();

		Bank matt = new Checking("Matthew", "Pearce",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());

		System.out
				.println("\nRandomly Generated Bank Activity for Customer: Matt\n");

		System.out.println(matt.getBankInfo());
		DataGenerator.simulateBankActivity(matt);

		Bank aleksa = new moneyMarket("Aleksa", "Djeric",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());

		System.out
				.println("Randomly Generated Bank Activity for Customer: Aleksa\n");
		DataGenerator.simulateBankActivity(aleksa);
		
		
		Bank Jake = new savings("Jake", "Mallard",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());

		System.out
				.println("Randomly Generated Bank Activity for Customer: Jake\n");
		DataGenerator.simulateBankActivity(Jake);
		
		Bank John = new CD("John", "Smith",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());

		System.out
				.println("Randomly Generated Bank Activity for Customer: John\n");
		DataGenerator.simulateBankActivity(John);
		
		
		// Add Customers

		CustomerDatabase.add(matt);
		CustomerDatabase.add(aleksa);
		CustomerDatabase.add(Jake);
		CustomerDatabase.add(John);
		System.out
				.println("\n\n\n"
						+ CustomerDatabase
						+ "\n\nThe array printed above prints out all bank customers regardless of their account type\nScroll up to see random bank actions performed");

	}
}
