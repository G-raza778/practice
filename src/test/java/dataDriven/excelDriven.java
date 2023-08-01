package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDriven {
public static void main(String[] args) throws IOException {
	File file=new File("./src/test/resources/list_of ids.xlsx");
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook xsw=new XSSFWorkbook(fis);
	XSSFSheet sheet=xsw.getSheetAt(0);
	int lastCellValue=sheet.getLastRowNum();
	Set<String>freshIDs=new HashSet<String>();
	for(int i=1;i<=lastCellValue;i++) {
	String cellValue=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println("the fetched data are:"+cellValue);
	freshIDs.add(cellValue);
}
	for(String unique:freshIDs) {
		System.out.println("the unique id's are: "+unique);
	}
}
}
