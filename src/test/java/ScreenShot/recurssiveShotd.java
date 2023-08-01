package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class recurssiveShotd {
	WebDriver driver;
@Test(invocationCount = 5)
public void chromeSS() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.al-islam.org/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Random r=new Random();
	int i=r.nextInt();
	String s="chrome"+i;
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dest=new File("E://New Selenium//forPractice1//ScreenShots//s.png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	driver.quit();
}
}
