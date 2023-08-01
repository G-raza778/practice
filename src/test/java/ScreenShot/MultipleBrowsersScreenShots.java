package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsersScreenShots {
	WebDriver driver;
@Test
public void chromeSS() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.al-islam.org/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dest=new File("E://New Selenium//forPractice1//ScreenShots//chrome.png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}
@Test
public void edgeSS() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.al-islam.org/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dest=new File("E://New Selenium//forPractice1//ScreenShots//edge.png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}
@Test
public void firefoxSS() {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.al-islam.org/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dest=new File("E://New Selenium//forPractice1//ScreenShots//firefox.png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
}
}

