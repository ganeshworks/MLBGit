package com.Mylpg.Com.LpgBooksWebsite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {

	public static void main(String[] args) throws IOException {

        FileInputStream fi = new FileInputStream("C:\\Users\\DELL\\Downloads\\Salary-Calculation-Sheet-and-Salary-Slip-Template-in-Excel.xlsx");
        XSSFWorkbook w = new XSSFWorkbook(fi);
        XSSFSheet s = w.getSheet("Database");

        // Find the row to start iterating (replace 1 with the desired row index)
        int startRow = 1;

        for (int i = startRow; i <= s.getLastRowNum(); i++) {
            XSSFRow r = s.getRow(i);

            // Check if the first cell (assuming Name is in the first column) contains "test1" (case-insensitive)
            if (r.getCell(0) != null && r.getCell(0).getStringCellValue().equalsIgnoreCase("WriteintoExcel1")) {
                System.out.println("Row " + i + " data:");

                // Print all cell values in the current row (handling numeric cells)
                for (int j = 0; j < r.getLastCellNum(); j++) {
                    XSSFCell cell = r.getCell(j);
                    if (cell != null) {
                        // Check cell type before accessing data
                        if (cell.getCellType() == CellType.STRING) {
                            System.out.print(cell.getStringCellValue() + "\n");
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            // Convert numeric cell value to string for printing
                            System.out.print(cell.getNumericCellValue() + "\n");
                        } else {
                            System.out.print("  "); // Handle other cell types (e.g., blank)
                        }
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(); // Print a new line after each row data
            }
            for (int j = 0; j < r.getLastCellNum(); j++) {
                XSSFCell cell = r.getCell(j);
                if (cell != null) {
                    // Check cell type before accessing data
                    if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + "\n");
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        try {
                            // Try to get numeric value directly
                            System.out.print(cell.getNumericCellValue() + "\n");
                        } catch (IllegalStateException e) {
                            // Handle potential exception for large numbers
                            System.out.print(String.format("%.2f", cell.getNumericCellValue()) + "\n"); // Print with 2 decimal places
                        }
                    } else {
                        System.out.print("  "); // Handle other cell types (e.g., blank)
                    }
                } else {
                    System.out.print("  ");
                }
            }
        }
        

	}}
