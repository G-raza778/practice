package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigatingCommands {
public static void main(String[] args) {
	String URL="http://www.flipkart.com";
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.google.com");
	driver.get("http://www.fb.com");
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	//driver.navigate().to(URL);
	driver.get(URL);
}
}
