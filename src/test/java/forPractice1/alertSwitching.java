package forPractice1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertSwitching {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().alert().accept();//for accepting the response
	driver.switchTo().alert().dismiss();//for declining the response
}
}
