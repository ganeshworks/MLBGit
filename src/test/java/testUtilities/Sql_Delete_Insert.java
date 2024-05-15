package testUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql_Delete_Insert {

	

		 String jdbcUrl = "jdbc:mysql://localhost:3306/mylpgtestdata";
		    String username = "root";
		    String password = "Ganesh@23";

		    public void insertDataToMySQL(String PRODNAME, String UNITS, String GST, String HSNCODE, String SECDEP,
		    		String OPFULLS, String OPEMPTIES, String CURFULLS, String CUREMP, String EFFDATE,String flag) {

		        String query1 = "INSERT INTO mylpgtestdata.deletiondata (PRODUCT, UNITS, GST, HSNCODE, SECURITYDEPOSIT, OPENINGFULLS, OPENINGEMPTIES, CURRENTFULLS, CURRENTEMPTIES, EFFECTIVEDATE, flag) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
		             PreparedStatement preparedStatement1 = connection.prepareStatement(query1)) {

		            preparedStatement1.setString(1, PRODNAME);
		            preparedStatement1.setString(2, UNITS);
		            preparedStatement1.setString(3, GST);
		            preparedStatement1.setString(4, HSNCODE);
		            preparedStatement1.setString(5, SECDEP);
		            preparedStatement1.setString(6, OPFULLS);
		            preparedStatement1.setString(7, OPEMPTIES);
		            preparedStatement1.setString(8, CURFULLS);
		            preparedStatement1.setString(9, CUREMP);
		            preparedStatement1.setString(10, EFFDATE);
		            preparedStatement1.setString(11, flag);

		            int rowsAffected = preparedStatement1.executeUpdate();

		            if (rowsAffected > 0) {
		                System.out.println("Data inserted into MySQL table successfully.");
		            } else {
		                System.out.println("Failed to insert data into MySQL table.");
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

	}


