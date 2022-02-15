package org.Hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Adac {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\logum\\eclipse-workspace\\Adactin\\Excel\\Data1.xlsx");
		FileInputStream str = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(str);
		Sheet sheet=book.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell = row.getCell(3);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
			String data = new SimpleDateFormat("dd-MMM-yyy").format(cell.getDateCellValue());
			System.out.println(data);
			break;
			}
			else {
				String name = BigDecimal.valueOf(cell.getNumericCellValue()).toString();
				System.out.println(name);
			}
		default:
			break;
		}
	}

}
