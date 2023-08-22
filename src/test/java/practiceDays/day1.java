package practiceDays;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {
	public static void main(String[] args) {
		////////////////// Swaping two numbers///////////////////
		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("the inverted numbers are:");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		////////////////////////// reverse string//////////////////
		String s = "gulam";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println("the reversed string is:");
		System.out.println(s1);
		//////////////////////// 2nd max element in the given array//////////////
		int[] arr = { 1, 3, 25, 64, 3, 45, 67, 34 };
		Arrays.sort(arr);
		int max = arr[arr.length - 1];

		System.out.println("the 2nd max element in the given array is:");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < max) {
				System.out.println(arr[i]);
				break;
			}
		}
		////////////////////////// check for given number is prime number or
		////////////////////////// not///////////////////
		int num = 13;
		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 2) {
				System.out.println(num + " is the prime number.");
			}
		}
		//////////////////////////// taking screenshots////////////////////////////////
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/googleCheck.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
