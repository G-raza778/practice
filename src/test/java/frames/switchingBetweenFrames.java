package frames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchingBetweenFrames {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String parentWin=driver.getWindowHandle();
	driver.findElement(By.id("newWindowBtn")).click();
	Set<String>handles=driver.getWindowHandles();
	for(String s:handles) {
		if(!s.equals(parentWin)) {
			driver.switchTo().window(s);
		}
	}
	driver.findElement(By.id("firstName")).sendKeys("gulam"+Keys.TAB+"ahmed");
	driver.findElement(By.id("malerb")).click();
	driver.findElement(By.id("englishchbx")).click();
	driver.findElement(By.id("hindichbx")).click();
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com"+Keys.TAB+"cbaabc@");
	driver.findElement(By.id("registerbtn")).click();
	
}
}
