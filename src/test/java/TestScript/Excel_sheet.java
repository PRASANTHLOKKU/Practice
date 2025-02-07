package TestScript;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_sheet {
	@Test
	public void test() throws IOException {
		String File_Path = "C:\\Users\\prasa\\eclipse-workspace\\Practice\\src\\test\\resources\\Test_Data\\Login.xlsx";

		FileInputStream File = new FileInputStream(File_Path);
		XSSFWorkbook Work_Book = new XSSFWorkbook(File);
		XSSFSheet sheet = Work_Book.getSheet("Login_Details");

//		int row_count = 0;
//		int col_count = 0;
//		for(int r = 0; r<=sheet.getLastRowNum();r++) {
//			Row row = sheet.getRow(r);
//			if(row!=null) {
//				boolean Row_has_data = false;
//				
//				for(int c = 0; c<row.getLastCellNum(); c++) {
//					Cell cell = row.getCell(c);
//					 if (cell != null && !cell.toString().trim().isEmpty()) {
//						 Row_has_data = true;
//						 col_count = Math.max(col_count, c + 1); // Track maximum column index with data
//	                    }
//	                }
//				if(Row_has_data) {
//					row_count++;
//;				}
//			}
//		}
//		
//		System.out.println("Number of rows with data: " + row_count);
//		System.out.println("Number of columns with data: " + col_count);

		for (int r = 0; r <= sheet.getLastRowNum(); r++) {
			Row row = sheet.getRow(r);

			if (row == null) {
				continue;
			}
			for (int c = 0; c < row.getLastCellNum(); c++) {
				Cell cell = row.getCell(c);

				if (cell == null || cell.toString().trim().isEmpty()) {
					System.out.println("\t");
					continue;
				}

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "\ts");
					break;
				default:
					System.out.print("UNKNOWN" + "\t");
					break;
				}
				System.out.printf("|");
			}
			System.out.println();
		}

	}
}