import java.util.UUID;
import java.util.*;

public class TextLab13Main {

	public static void main(String[] args) {

		Bank matt = new Checking("Matthew", "Pearce",
				DataGenerator.generateCreditScore(),
				DataGenerator.generatePhoneNumber(),
				DataGenerator.generateSocialSecurity(),
				DataGenerator.generateAddress());

		matt.deposit(500.56);
		System.out.println(matt + "\n\n" + matt.getFutureBalance(5));

		/*
		 * Bank aleksa = new moneyMarket("Aleksa", "Djeric",
		 * DataGenerator.generateCreditScore(),
		 * DataGenerator.generatePhoneNumber(),
		 * DataGenerator.generateSocialSecurity(),
		 * DataGenerator.generateAddress());
		 * 
		 * System.out.println(aleksa);
		 */
	}
}
