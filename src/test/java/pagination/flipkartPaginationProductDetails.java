package pagination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartPaginationProductDetails {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		driver.findElement(By.xpath("//button[.=\"✕\"]")).click();
		}
		catch(Exception e) {}
		driver.findElement(By.name("q")).sendKeys("realme", Keys.ENTER);

		WebElement next = driver.findElement(By.xpath("//span[.=\"Next\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1050)", "");
		List<WebElement> products = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		for (WebElement w : products) {
			System.out.println(w.getText());
		}
		while (next.isDisplayed()) {
			next.click();
			js.executeScript("arguments[0].scrollIntoView();", next);
			Thread.sleep(2000);

			products = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
			for (WebElement w : products) {
				System.out.println(w.getText());
			}

		}
	}
}
