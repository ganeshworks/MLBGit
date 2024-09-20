package com.Mylpg.Com.LpgBooksWebsite;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class SqlPractice {

	// Database credentials
		static final String DB_URL = "jdbc:mysql://localhost:3306/mylpgtestdata";
		static final String USER = "root";
		static final String PASS = "Ganesh@23";
		
		public static void main(String[] args) {
			// Database query
			String query = "SELECT * FROM mylpgtestdata.testdata where modulename='vendor po' and quotationNumber='632266373' ";

			// Excel file path
			String excelFilePath = "C:\\Users\\DELL\\Downloads\\Dbdata.xlsx";
			
			try (Connection connection=DriverManager.getConnection(DB_URL, USER, PASS);
					Statement statement=connection.createStatement();
					ResultSet resultset=statement.executeQuery(query);
					Workbook workbook=new XSSFWorkbook()){
				
				Sheet sheet=workbook.createSheet("Database Results");
				
				
				
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}

		}
		private static void writeresultsetexcel(ResultSet resultse,Sheet sheett) throws SQLException {
			java.sql.ResultSetMetaData meta=resultse.getMetaData();
			
			int columncount=meta.getColumnCount();
			
			Row headrow=sheett.createRow(0);
			
			for(int i=0;i<=columncount;i++) {
				Cell cell=headrow.createCell(i-1);
				cell.setCellValue(meta.getColumnName(i));
			}
			
		}
		}
