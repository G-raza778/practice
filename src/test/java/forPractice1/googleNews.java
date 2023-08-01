package forPractice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleNews {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"VCnfNe\"]/descendant::a"));
		for (WebElement e : list) {
			System.out.println(e.getText());
		}
		driver.close();
	}
}
