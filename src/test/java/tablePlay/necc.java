package tablePlay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class necc {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.e2necc.com/home/eggprice");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement>eggRate=driver.findElements(By.xpath("//table/tbody/tr/td"));
	List<WebElement>row=driver.findElements(By.xpath("//table/tbody/tr"));//9
	List<WebElement>cell=driver.findElements(By.xpath("//table/tbody/tr"));//45
	int cells=cell.size();
	int rows=row.size();
	int days=eggRate.size();
	for(int i=7;i<=rows;i++) {
		for(int j=12;j<=cells;j++) {
		String daam=eggRate.get(j).getText();
		System.out.println(daam);
	}
		break;
	}
}
}
