package testUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.*;

public class Sql_Insert {

	String jdbcUrl = "jdbc:mysql://localhost:3306/mylpgtestdata";
	String username = "root";
	String password = "Ganesh@23";

	public void insertDataToMySQL1(String modulename1, String invoicenumber1, String invoicedate1,
			String stockrecvddate1, String productName1, String loadtype1, int unitrate1, String trucknumber1,
			String drivername1, String godown1, String receivedby1) {

		// String query = "INSERT INTO mylpgtestdata.testdata (modulename,
		// invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate,
		// trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?,
		// ?, ?, ?)";
		String query1 = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate, trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String query3 = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate, trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String query4 = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate, trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement1 = connection.prepareStatement(query1);

				PreparedStatement preparedStatement3 = connection.prepareStatement(query3);
				PreparedStatement preparedStatement4 = connection.prepareStatement(query4)) {

			preparedStatement1.setString(1, modulename1);
			preparedStatement1.setString(2, invoicenumber1);
			preparedStatement1.setString(3, invoicedate1);
			preparedStatement1.setString(4, stockrecvddate1);
			preparedStatement1.setString(5, productName1);
			preparedStatement1.setString(6, loadtype1);
			preparedStatement1.setInt(7, unitrate1);
			preparedStatement1.setString(8, trucknumber1);
			preparedStatement1.setString(9, drivername1);
			preparedStatement1.setString(10, godown1);
			preparedStatement1.setString(11, receivedby1);

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

	public void insertDataToMySQL2(String modulename1, String invoicenumber1, String invoicedate1,
			String stockrecvddate1, String productName1, String loadtype1, int unitrate1, String trucknumber1,
			String drivername1, String godown1, String receivedby1) {

		// ?, ?, ?)";
		String query2 = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate, trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement1 = connection.prepareStatement(query2)) {

			preparedStatement1.setString(1, modulename1);
			preparedStatement1.setString(2, invoicenumber1);
			preparedStatement1.setString(3, invoicedate1);
			preparedStatement1.setString(4, stockrecvddate1);
			preparedStatement1.setString(5, productName1);
			preparedStatement1.setString(6, loadtype1);
			preparedStatement1.setInt(7, unitrate1);
			preparedStatement1.setString(8, trucknumber1);
			preparedStatement1.setString(9, drivername1);
			preparedStatement1.setString(10, godown1);
			preparedStatement1.setString(11, receivedby1);

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

	public void insertDataToMySQL3(String modulename1, String invoicenumber1, String invoicedate1,
			String stockrecvddate1, String productName1, String loadtype1, int unitrate1, String trucknumber1,
			String drivername1, String godown1, String receivedby1) {

		// String query = "INSERT INTO mylpgtestdata.testdata (modulename,
		// invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate,
		// trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?,
		// ?, ?, ?)";

		String query3 = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate, trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

				PreparedStatement preparedStatement1 = connection.prepareStatement(query3)) {

			preparedStatement1.setString(1, modulename1);
			preparedStatement1.setString(2, invoicenumber1);
			preparedStatement1.setString(3, invoicedate1);
			preparedStatement1.setString(4, stockrecvddate1);
			preparedStatement1.setString(5, productName1);
			preparedStatement1.setString(6, loadtype1);
			preparedStatement1.setInt(7, unitrate1);
			preparedStatement1.setString(8, trucknumber1);
			preparedStatement1.setString(9, drivername1);
			preparedStatement1.setString(10, godown1);
			preparedStatement1.setString(11, receivedby1);

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

	public void insertDataToMySQL4(String modulename1, String invoicenumber1, String invoicedate1,
			String stockrecvddate1, String productName1, String loadtype1, int unitrate1, String trucknumber1,
			String drivername1, String godown1, String receivedby1) {

		// String query = "INSERT INTO mylpgtestdata.testdata (modulename,
		// invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate,
		// trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?,
		// ?, ?, ?)";
		String query4 = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber, invoicedate, stockrecvddate, productName, loadtype, unitrate, trucknumber, drivername, godown, receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

				PreparedStatement preparedStatement1 = connection.prepareStatement(query4)) {

			preparedStatement1.setString(1, modulename1);
			preparedStatement1.setString(2, invoicenumber1);
			preparedStatement1.setString(3, invoicedate1);
			preparedStatement1.setString(4, stockrecvddate1);
			preparedStatement1.setString(5, productName1);
			preparedStatement1.setString(6, loadtype1);
			preparedStatement1.setInt(7, unitrate1);
			preparedStatement1.setString(8, trucknumber1);
			preparedStatement1.setString(9, drivername1);
			preparedStatement1.setString(10, godown1);
			preparedStatement1.setString(11, receivedby1);

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

	public void insertDataToVendorPO1(String moduleName, String podate, String ponumber, String vendorname,
			String quotationnumber, String quotationdate, String narration, String validupto, String poterms,
			String productname, int unitrate, int quantity, int othercharges) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, podate, ponumber, vendorname, quotationnumber, quotationdate, narration, validupto, poterms, productname, unitrate, quantity, othercharges) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, podate);
			preparedStatement.setString(3, ponumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, quotationnumber);
			preparedStatement.setString(6, quotationdate);
			preparedStatement.setString(7, narration);
			preparedStatement.setString(8, validupto);
			preparedStatement.setString(9, poterms);
			preparedStatement.setString(10, productname);
			preparedStatement.setInt(11, unitrate);
			preparedStatement.setInt(12, quantity);
			preparedStatement.setInt(13, othercharges);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDataToVendorPO2(String moduleName, String podate, String ponumber, String vendorname,
			String quotationnumber, String quotationdate, String narration, String validupto, String poterms,
			String productname, int unitrate, int quantity, int othercharges) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, podate, ponumber, vendorname, quotationnumber, quotationdate, narration, validupto, poterms, productname, unitrate, quantity, othercharges) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, podate);
			preparedStatement.setString(3, ponumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, quotationnumber);
			preparedStatement.setString(6, quotationdate);
			preparedStatement.setString(7, narration);
			preparedStatement.setString(8, validupto);
			preparedStatement.setString(9, poterms);
			preparedStatement.setString(10, productname);
			preparedStatement.setInt(11, unitrate);
			preparedStatement.setInt(12, quantity);
			preparedStatement.setInt(13, othercharges);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToVendorPO3(String moduleName, String podate, String ponumber, String vendorname,
			String quotationnumber, String quotationdate, String narration, String validupto, String poterms,
			String productname, int unitrate, int quantity, int othercharges) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, podate, ponumber, vendorname, quotationnumber, quotationdate, narration, validupto, poterms, productname, unitrate, quantity, othercharges) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, podate);
			preparedStatement.setString(3, ponumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, quotationnumber);
			preparedStatement.setString(6, quotationdate);
			preparedStatement.setString(7, narration);
			preparedStatement.setString(8, validupto);
			preparedStatement.setString(9, poterms);
			preparedStatement.setString(10, productname);
			preparedStatement.setInt(11, unitrate);
			preparedStatement.setInt(12, quantity);
			preparedStatement.setInt(13, othercharges);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToVendorPO4(String moduleName, String podate, String ponumber, String vendorname,
			String quotationnumber, String quotationdate, String narration, String validupto, String poterms,
			String productname, int unitrate, int quantity, int othercharges) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, podate, ponumber, vendorname, quotationnumber, quotationdate, narration, validupto, poterms, productname, unitrate, quantity, othercharges) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, podate);
			preparedStatement.setString(3, ponumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, quotationnumber);
			preparedStatement.setString(6, quotationdate);
			preparedStatement.setString(7, narration);
			preparedStatement.setString(8, validupto);
			preparedStatement.setString(9, poterms);
			preparedStatement.setString(10, productname);
			preparedStatement.setInt(11, unitrate);
			preparedStatement.setInt(12, quantity);
			preparedStatement.setInt(13, othercharges);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToNFRPO1(String moduleName, String invoicenumber, String invoicedate, String stockrecvddate,
			String vendorname, String reversecharge, String ponumber, String podate, String productName, int unitrate1,
			int quantity, String trucknumber1, String drivername1, String receivedby1) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber,invoicedate, stockrecvddate, vendorname, reversecharge, ponumber, podate, productName, unitrate, quantity, trucknumber,drivername,receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicenumber);
			preparedStatement.setString(3, invoicedate);
			preparedStatement.setString(4, stockrecvddate);
			preparedStatement.setString(5, vendorname);
			preparedStatement.setString(6, reversecharge);
			preparedStatement.setString(7, ponumber);
			preparedStatement.setString(8, podate);
			preparedStatement.setString(9, productName);
			preparedStatement.setInt(10, unitrate1);
			preparedStatement.setInt(11, quantity);
			preparedStatement.setString(12, trucknumber1);
			preparedStatement.setString(13, drivername1);
			preparedStatement.setString(14, receivedby1);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToNFRPO2(String moduleName, String invoicenumber, String invoicedate, String stockrecvddate,
			String vendorname, String reversecharge, String ponumber, String podate, String productName, int unitrate1,
			int quantity, String trucknumber1, String drivername1, String receivedby1) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber,invoicedate, stockrecvddate, vendorname, reversecharge, ponumber, podate, productName, unitrate, quantity, trucknumber,drivername,receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicenumber);
			preparedStatement.setString(3, invoicedate);
			preparedStatement.setString(4, stockrecvddate);
			preparedStatement.setString(5, vendorname);
			preparedStatement.setString(6, reversecharge);
			preparedStatement.setString(7, ponumber);
			preparedStatement.setString(8, podate);
			preparedStatement.setString(9, productName);
			preparedStatement.setInt(10, unitrate1);
			preparedStatement.setInt(11, quantity);
			preparedStatement.setString(12, trucknumber1);
			preparedStatement.setString(13, drivername1);
			preparedStatement.setString(14, receivedby1);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToNFRPO3(String moduleName, String invoicenumber, String invoicedate, String stockrecvddate,
			String vendorname, String reversecharge, String ponumber, String podate, String productName, int unitrate1,
			int quantity, String trucknumber1, String drivername1, String receivedby1) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber,invoicedate, stockrecvddate, vendorname, reversecharge, ponumber, podate, productName, unitrate, quantity, trucknumber,drivername,receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicenumber);
			preparedStatement.setString(3, invoicedate);
			preparedStatement.setString(4, stockrecvddate);
			preparedStatement.setString(5, vendorname);
			preparedStatement.setString(6, reversecharge);
			preparedStatement.setString(7, ponumber);
			preparedStatement.setString(8, podate);
			preparedStatement.setString(9, productName);
			preparedStatement.setInt(10, unitrate1);
			preparedStatement.setInt(11, quantity);
			preparedStatement.setString(12, trucknumber1);
			preparedStatement.setString(13, drivername1);
			preparedStatement.setString(14, receivedby1);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToNFRPO4(String moduleName, String invoicenumber, String invoicedate, String stockrecvddate,
			String vendorname, String reversecharge, String ponumber, String podate, String productName, int unitrate1,
			int quantity, String trucknumber1, String drivername1, String receivedby1) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicenumber,invoicedate, stockrecvddate, vendorname, reversecharge, ponumber, podate, productName, unitrate, quantity, trucknumber,drivername,receivedby) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicenumber);
			preparedStatement.setString(3, invoicedate);
			preparedStatement.setString(4, stockrecvddate);
			preparedStatement.setString(5, vendorname);
			preparedStatement.setString(6, reversecharge);
			preparedStatement.setString(7, ponumber);
			preparedStatement.setString(8, podate);
			preparedStatement.setString(9, productName);
			preparedStatement.setInt(10, unitrate1);
			preparedStatement.setInt(11, quantity);
			preparedStatement.setString(12, trucknumber1);
			preparedStatement.setString(13, drivername1);
			preparedStatement.setString(14, receivedby1);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertDataToOtherPurchases(String moduleName, String invoicedate, String invoicenumber,
			String vendorname, String productName, String hsn, int quantity, String units, int unitrate) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicedate, invoicenumber, vendorname,  productName, hsn, quantity,units,unitrate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicedate);
			preparedStatement.setString(3, invoicenumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, productName);
			preparedStatement.setString(6, hsn);
			preparedStatement.setInt(7, quantity);
			preparedStatement.setString(8, units);
			preparedStatement.setInt(9, unitrate);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDataToOtherPurchasesNO(String moduleName, String invoicedate, String invoicenumber,
			String vendorname, String productName, int quantity, String units, int unitrate, String narration) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicedate, invoicenumber, vendorname,  productName,  quantity,units,unitrate,narration) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicedate);
			preparedStatement.setString(3, invoicenumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, productName);
			preparedStatement.setInt(6, quantity);
			preparedStatement.setString(7, units);
			preparedStatement.setInt(8, unitrate);
			preparedStatement.setString(9, narration);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDataToNFRSales01(String moduleName, String invoicedate, String invoicenumber, String custname,
			String ponumber, String poterms, String staffname, String trucknumber, String productName, int discount,
			int quantity) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicedate, invoicenumber, custname, ponumber, poterms, staffname, trucknumber, productName, discount, quantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicedate);
			preparedStatement.setString(3, invoicenumber);
			preparedStatement.setString(4, custname); // Assuming 'custname' maps to 'vendorname' in the table
			preparedStatement.setString(5, ponumber);
			preparedStatement.setString(6, poterms);
			preparedStatement.setString(7, staffname);
			preparedStatement.setString(8, trucknumber);
			preparedStatement.setString(9, productName);
			preparedStatement.setInt(10, discount);
			preparedStatement.setInt(11, quantity);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDataToOtherItcEligible(String moduleName, String invoicedate, String invoicenumber,
			String vendorname, String productName, String hsn, int quantity, String units) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, invoicedate, invoicenumber, vendorname, productName, hsn, quantity, units) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, invoicedate);
			preparedStatement.setString(3, invoicenumber);
			preparedStatement.setString(4, vendorname);
			preparedStatement.setString(5, productName);
			preparedStatement.setString(6, hsn);
			preparedStatement.setInt(7, quantity);
			preparedStatement.setString(8, units);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Data inserted into MySQL table successfully.");
			} else {
				System.out.println("Failed to insert data into MySQL table.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertDataToQuotations(String moduleName, String quotationdate, String custname, String staffname,
			String narration, String productcategory, String productName, int discount, int quantity) {

		String query = "INSERT INTO mylpgtestdata.testdata (modulename, quotationdate, custname, staffname, narration, productcategory, productName, discount, quantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, moduleName);
			preparedStatement.setString(2, quotationdate);
			preparedStatement.setString(3, custname);
			preparedStatement.setString(4, staffname);
			preparedStatement.setString(5, narration);
			preparedStatement.setString(6, productcategory);
			preparedStatement.setString(7, productName);
			preparedStatement.setInt(8, discount);
			preparedStatement.setInt(9, quantity);

			int rowsAffected = preparedStatement.executeUpdate();

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
