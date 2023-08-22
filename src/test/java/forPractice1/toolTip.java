package forPractice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolTip {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/playlist?list=PLnNg6KqJ3HGh8K2KhCCxraHh09L3LPL4E");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String toolTip=driver.findElement(By.xpath("//tp-yt-paper-tooltip[@class=\"style-scope ytd-searchbox\"]/div")).getText();
	System.out.println(toolTip);
	//driver.close();
}
}
