package com.Mylpg.Com.LpgBooksWebsite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class SqltoExcelCode {

	// Database credentials
	static final String DB_URL = "jdbc:mysql://localhost:3306/mylpgtestdata";
	static final String USER = "root";
	static final String PASS = "Ganesh@23";

	public static void main(String[] args) {
		// Database query
		String query = "SELECT * FROM mylpgtestdata.testdata where modulename='vendor po' and quotationNumber='632266373' ";

		// Excel file path
		String excelFilePath = "C:\\Users\\DELL\\Downloads\\Dbdata.xlsx";

		try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query);
				Workbook workbook = new XSSFWorkbook()) {

			// Create a sheet in the workbook
			Sheet sheet = workbook.createSheet("Database Results");

			// Write the ResultSet data to the sheet
			writeResultSetToExcel(resultSet, sheet);

			// Save the workbook to a file
			try (FileOutputStream fileOut = new FileOutputStream(excelFilePath)) {
				workbook.write(fileOut);
				System.out.println("Data successfully written to Excel file.");
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeResultSetToExcel(ResultSet resultSet, Sheet sheet) throws SQLException {

		ResultSetMetaData metaData = resultSet.getMetaData();

		int columnCount = metaData.getColumnCount();

		// Create header row
		Row headerRow = sheet.createRow(0);
		
		for (int i = 1; i <= columnCount; i++) {
			Cell cell = headerRow.createCell(i - 1);
			cell.setCellValue(metaData.getColumnName(i));
		}

		// Create data rows
		int rowIndex = 1;
		
		while (resultSet.next()) {
			Row row = sheet.createRow(rowIndex++);
			for (int i = 1; i <= columnCount; i++) {
				Cell cell = row.createCell(i - 1);
				setCellValue(cell, resultSet, i);
			}
		}
	}

	private static void setCellValue(Cell cell, ResultSet resultSet, int columnIndex) throws SQLException {
		switch (resultSet.getMetaData().getColumnType(columnIndex)) {
		case Types.INTEGER:
			cell.setCellValue(resultSet.getInt(columnIndex));
			break;
		case Types.FLOAT:
			cell.setCellValue(resultSet.getFloat(columnIndex));
			break;
		case Types.DOUBLE:
			cell.setCellValue(resultSet.getDouble(columnIndex));
			break;
		case Types.VARCHAR:
			cell.setCellValue(resultSet.getString(columnIndex));
			break;
		case Types.BOOLEAN:
			cell.setCellValue(resultSet.getBoolean(columnIndex));
			break;
		case Types.DATE:
			cell.setCellValue(resultSet.getDate(columnIndex).toString());
			break;
		default:
			cell.setCellValue(resultSet.getString(columnIndex));
			break;
		}
	}
}
