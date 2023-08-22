package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public static WebDriver driver;
public void initialisation() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public void takingScreenShots() throws IOException {
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	Random r=new Random();
	int i=r.nextInt();
	String s="./ScreenShots/products"+i+".png";
	File dest=new File(s);
	FileUtils.copyFile(src, dest);
}
}
