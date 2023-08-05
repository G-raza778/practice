package string;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timesOfIndia {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://timesofindia.indiatimes.com/india/timestopten.cms");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	List<WebElement>news=driver.findElements(By.xpath("//a[@class=\"news_title\"]"));
	for(WebElement e:news) {
		System.out.println(e.getText());
	}
}
}
