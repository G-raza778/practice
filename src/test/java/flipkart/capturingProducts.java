package flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class capturingProducts {
	
	@Test(invocationCount = 1)
public void m() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[.=\"✕\"]")).click();
	driver.findElement(By.name("q")).sendKeys("realme",Keys.ENTER);

	List<Integer> l  = new ArrayList<>();
	List<WebElement>list=driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]/parent::div/parent::div/descendant::div[@class=\"_30jeq3 _1_WHN1\"]"));
	for(WebElement web:list) {
		String price=web.getText().replace(",", "").replace("₹", "");
		//System.out.println(price);
		int sorttedprice=Integer.parseInt(price);
		l.add(sorttedprice);
	
	}
	Collections.sort(l);
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
	}
	
	driver.quit();
}

}
