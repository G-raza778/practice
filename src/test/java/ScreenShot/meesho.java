package ScreenShot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class meesho extends baseClass{
WebDriver driver;

@BeforeMethod
public void setup() {
	initialisation();
}
@Test
public void executions() {
	driver.findElement(By.xpath("//span[.=\"Men\"][@class=\"sc-eDvSVe dURizl\"]")).click();
	driver.findElement(By.xpath("//p[.=\"Men Kurtas\"]")).click();
	List<WebElement>products=driver.findElements(By.xpath("//div[@class=\"sc-dkrFOg ProductList__GridCol-sc-8lnc8o-0 cokuZA eCJiSA\"]/descendant::h5"));
	for(WebElement e:products) {
		System.out.println(e.getText());
	}
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
