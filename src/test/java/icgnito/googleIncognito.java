package icgnito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleIncognito {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(option);
	driver.get("http://www.google.com");
}
}
