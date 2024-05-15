package testCases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcelData {

	public static List<String> getMatchingCellValues(String filePath, int sheetIndex, String startingString) {
		List<String> matchingCellValues = new ArrayList<String>();
		try {
			FileInputStream fileInputStream = new FileInputStream(new File(filePath));
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheetAt(sheetIndex); // Use the provided sheet index
			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell.getCellType() == CellType.STRING && cell.getStringCellValue().startsWith(startingString)) {
						matchingCellValues.add(cell.getStringCellValue());
					}
				}
			}
			workbook.close();
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return matchingCellValues;
	}

	public static String getTextFromExcel() {
		String filePath = "C:/Users/DELL/Downloads/HSN_SACc.xlsx";

		int sheetIndex = 0; // Use 1 for the second sheet

		String startingString = "96035";

		List<String> cellValues = getMatchingCellValues(filePath, sheetIndex, startingString);

		// Check if cellValues is empty
		if (cellValues.isEmpty()) {
			System.out.println("No matching cell values found.");
			return null; // Or handle the case accordingly
		}

		Random random = new Random();
		int randomIndex = random.nextInt(cellValues.size());
		String randomCellValue = cellValues.get(randomIndex);
		System.out.println("Randomly selected cell value: " + randomCellValue);
		return randomCellValue;
	}

	public static void main(String[] args) {
		getTextFromExcel();
	}

}