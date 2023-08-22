package graphs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newStocksGraph {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.investing.com/charts/stocks-charts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
	
	//driver.findElement(By.className("class=\"popupCloseIcon largeBannerCloser\"")).click();
	List<WebElement>shares=driver.findElements(By.xpath("class=\"symbol-list deletable ui-sortable\""));
	for(WebElement e:shares) {
		System.out.println(e.getText());
	}
	
	
}
}
