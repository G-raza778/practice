package forPractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationP {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String str= driver.findElement(By.className("signup-form")).getText();
	System.out.println(str);
}
}
