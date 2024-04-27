package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomData {

	public static String randomstring() {

		Random random = new Random();

		// Define the alphabet
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		// Create a StringBuilder to store the generated random string
		StringBuilder sb = new StringBuilder();
		

		// Generate 6 random alphabets
		for (int i = 0; i < 6; i++) {
			// Generate a random index between 0 and 25 (inclusive) for the alphabet
			int index = random.nextInt(alphabet.length());
			sb.append(alphabet.charAt(index));

			// Append the alphabet character at the random index to the StringBuilder

		}
		String randomAlphabets = sb.toString();
		return randomAlphabets;

	}

	public static String randomInt() {

		Random random = new Random();

		// Generate a random 8-digit number
		int randomNumber = 100000000 + random.nextInt(900000000); // Generates a number between 10000000 and 99999999

		System.out.println("Random 8-digit number: " + randomNumber);

		String stringValue = Integer.toString(randomNumber);
		
		return stringValue;

	}

	public static String randomVehicleNum() {

		Random random = new Random();

		String RandomStateCode = randomInt().substring(2, 4);

		String RandomStringAfterState = randomstring().substring(0, 2);

		String RandomVehicleNumber = randomInt().substring(0, 4);

		String VehicleNum = generateRandomStateCode() + RandomStateCode + generateRandomStateCode() + RandomVehicleNumber;

		return VehicleNum;

	}

	private static String generateRandomStateCode() {
		// Assuming two-character state code
		String[] stateCodes = { "AP", "AR", "AS", "BR", "CT", "GA", "GJ", "HR", "HP", "JH", "KA", "KL", "MP", "MH",
				"MN", "ML", "MZ", "NL", "OR", "PB", "RJ", "SK", "TN", "TG", "TR", "UP", "UK", "WB" };
		
		Random random = new Random();
		
		return stateCodes[random.nextInt(stateCodes.length)];
	}

	public static void main(String[] args) {
		randomstring();
		randomInt();
		randomVehicleNum();
	}

}