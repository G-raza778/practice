package popups;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newTab {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String s1=driver.getWindowHandle();
	driver.findElement(By.id("tabButton")).click();
	Set<String>list=driver.getWindowHandles();
	for(String i:list) {
		if(!i.equals(s1)) {
			driver.switchTo().window(s1);
		}
	}
	driver.findElement(By.id("tabButton")).click();
	String s=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(s);
}
}
