package forPractice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchingBetweenWindowAndTabs {
	public static WebDriver driver;
	public static void Screenshot() throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		Random r=new Random();
		int i=r.nextInt();
		String s="./ScreenShots/products"+i+".png";
		File dest=new File(s);
		FileUtils.copyFile(src, dest);
	}
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		String google=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Screenshot();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.fb.com");
		System.out.println(driver.getTitle());
		String fb=driver.getWindowHandle();
		Screenshot();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://flipkart.com");
		System.out.println(driver.getTitle());
		String flipkart=driver.getWindowHandle();
		Screenshot();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://instagram.com");
		System.out.println(driver.getTitle());
		String insta=driver.getWindowHandle();
		Screenshot();
		
	}
}
