package bigbasket;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllProductDetails {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement shopByCategory = driver.findElement(By.xpath("//a[@class=\"dropdown-toggle meganav-shop\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(shopByCategory).perform();
		WebElement seconColomnProducts=driver.findElement(By.xpath("//ul[@id=\"navBarSticky\"]/following-sibling::div/descendant::a[.=\"Herbs & Seasonings\"]"));
		action.moveToElement(seconColomnProducts).perform();
//		List<WebElement> mainProd = driver.findElements(By.xpath("//ul[@id=\"navBarMegaNav\"]/li"));
//		for (WebElement categories : mainProd) {
//			System.out.println(categories.getText());
//		}
//		List<WebElement>SecondRow = driver.findElements(By.xpath("//div[@id=\"navbar\"]/descendant::div[@class=\"col-md-3 pad-rt-0 desgn-fix\"]/descendant::li"));
//		for(WebElement secondCAtegory:SecondRow) {
//			System.out.println(secondCAtegory.getText());
//		}
//		List<WebElement> fruits_veg = driver.findElements(By.xpath("//li[@class=\"dropdown full-wid hvr-drop\"]"
//				+ "/descendant::a[.=\"Fruits & Vegetables\"]/ancestor::ul[@id=\"navBarMegaNav\"]/following-sibling::div"
//				+ "/descendant::a[.=\"Fresh Vegetables\"]/parent::li/parent::ul/parent::div/following-sibling::div/descendant::li"));
//		for (WebElement products : fruits_veg) {
//			System.out.println(products.getText());
//		}
//		for(int i=0;i<mainProd.size();i++) {
//			String FirststColoumn=mainProd.get(i).getText();{
//				for(int j=0;j<SecondRow.size();j++) {
//					String SecondColumn=SecondRow.get(j).getText();
//					WebElement seconColomnProducts=driver.findElement(By.xpath("//ul[@id=\"navBarSticky\"]/following-sibling::div/descendant::a[.=\"Fresh Vegetables\"]"));
//					action.moveToElement(seconColomnProducts).perform();
//				}
//			}
//		}
	}
}
