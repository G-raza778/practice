package calender;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yatra {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.yatra.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 int year=2023;
	 String month="july";
	 
	 Calendar calender=Calendar.getInstance();
	 Date time =calender.getTime();
	 System.out.println(time);
}
}
