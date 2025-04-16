package genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtiliy {
	/**
	 * getDataFromExcel is for String Data.
	 * getDooleanDataFromExcel is for Boolean Data.
	 * getDateFromExcel is for data 
	 * @param sheetName
	 * @param rowindex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/shashiSheet.xlsx");
			Workbook web = WorkbookFactory.create(fis);
			return web.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getStringCellValue();
			
	}
	public boolean getDooleanDataFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/shashiSheet.xlsx");
			Workbook web = WorkbookFactory.create(fis);
			return web.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getBooleanCellValue();
			
	}
	public LocalDateTime getDateFromExcel(String sheetName,int rowindex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata/shashiSheet.xlsx");
			Workbook web = WorkbookFactory.create(fis);
			return web.getSheet(sheetName).getRow(rowindex).getCell(colIndex).getLocalDateTimeCellValue();
			
	}

}
