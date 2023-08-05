package forPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class you {
	@Test(invocationCount = 1)
	public void main() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.cssSelector("input#search")).sendKeys("sdet");
//		driver.findElement(By.id("search-icon-legacy")).click();
////		driver.findElement(By.cssSelector("button#search-icon-legacy")).click();
//	//	driver.findElement(By.cssSelector(""))
//		driver.findElement(By.id("id=\"text-image\"")).click();
//		driver.findElement(By.id("headline")).click();
//		driver.quit();
		String s=driver.getTitle();
		System.out.println(s);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.=\"Log in\"]")).click();
		
		String s2=driver.getTitle();
		System.out.println(s2);
}
}