package testUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SqlQuery {

	public static String getRandomDataStartingWith(String prefix) {

		// JDBC URL, username, and password for connecting to the MySQL database
		String jdbcUrl = "jdbc:mysql://localhost:3306/hsncodes";
		String username = "root";
		String password = "Ganesh@23";

		// SQL query to fetch data from the table with a specific prefix
		String query = "SELECT * FROM hsncodes.hsn_sacc WHERE `HSNCode` LIKE ?";

		List<String> hsnCodes = new ArrayList<String>();

		try {
			// Establish a connection to the database
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

			// Create a prepared statement for executing SQL queries
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			// Set the prefix parameter in the prepared statement
			preparedStatement.setString(1, prefix + "%");

			// Execute the query and get the result set
			ResultSet resultSet = preparedStatement.executeQuery();

			// Iterate through the result set and add HSN codes to the list
			for (; resultSet.next();) {
				// Extract the HSN code data
				String hsnCode = resultSet.getString("HSNCode");
				// Add the HSN code to the list
				hsnCodes.add(hsnCode);
			}

			// Close the result set, statement, and connection
			resultSet.close();

			preparedStatement.close();

			connection.close();

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		

		if (hsnCodes.isEmpty()) 
		{
			// Return null if the list is empty
			return null;
		}
		
		else {
			// Choose a random HSN code from the list
			
			Random random = new Random();

			int randomIndex = random.nextInt(hsnCodes.size());

			return hsnCodes.get(randomIndex);
			
		}
	}

	public static String Pref() {

		String prefix = "27111";

		// Get a random HSN code starting with the specified prefix

		String randomHSNCode = getRandomDataStartingWith(prefix);

		if (randomHSNCode != null) {
			System.out.println("Random HSN Code: " + randomHSNCode);
		} 
		else {
			System.out.println("No matching HSN code found.");
		}
		
		return randomHSNCode;
	}

	public static void main(String[] args) {
		// Specify the prefix to search for (e.g., "27111")
		Pref();

	}
}
