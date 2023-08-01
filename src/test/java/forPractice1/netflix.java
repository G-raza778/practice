package forPractice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class netflix {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.netflix.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ques = driver
				.findElements(By.xpath("//ul[@id=\"nmhp-card-faq-accordion\"]/child::li/child::h3/descendant::span"));
		List<WebElement> ans = driver.findElements(
				By.xpath("//ul[@id=\"nmhp-card-faq-accordion\"]/child::li/child::h3/following-sibling::div"));
		for (WebElement e : ques) {
			System.out.println(e.getText());
			e.click();
			for(WebElement a:ans) {
				System.out.println(a.getText());
			}
		}
		driver.close();
	}
}
