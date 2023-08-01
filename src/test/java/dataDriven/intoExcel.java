package dataDriven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class intoExcel {
@Test
public void writingData() throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme phones"+Keys.ENTER);
	
	
	XSSFWorkbook xss=new XSSFWorkbook();
	XSSFSheet sheet=xss.createSheet("phones price");
	
	List<WebElement>pNames=driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	int rowNum=0;
	for(WebElement e:pNames) {
		String pro=e.getText();
		System.out.println(pro);
		 Row row = sheet.createRow(rowNum++);
         Cell cell = row.createCell(0);
         cell.setCellValue(pro);
	}
	List<WebElement>pPrices=driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]/parent::a/parent::h2/parent::div/following-sibling::div[@class=\"sg-row\"]/descendant::span[@class=\"a-price-whole\"]"));
	
	for(WebElement p:pPrices) {
		String price=p.getText();
		System.out.println(price);
		 Row row = sheet.createRow(rowNum++);
         Cell cell = row.createCell(1);
         cell.setCellValue(price);
	}
	File file=new File("./src/test/resources/TestData.xlsx");
	FileOutputStream fos=new FileOutputStream(file);
	xss.write(fos);
	fos.close();

	
	
}
}
