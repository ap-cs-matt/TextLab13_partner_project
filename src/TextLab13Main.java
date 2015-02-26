import java.util.*;

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
		// Add Customer

		CustomerDatabase.add(matt);
		CustomerDatabase.add(aleksa);
		System.out
				.println("\n\n\n"
						+ CustomerDatabase
						+ "\n\nThe array printed above prints out all bank customers regardless of their account type\nScroll up to see random bank actions performed");

	}
}
