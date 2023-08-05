package forPractice1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleUSingScanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the text you want to search:");
	String text=sc.next();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.findElement(By.id("APjFqb")).sendKeys(text);
}
}
