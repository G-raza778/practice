package listenersTakingScreenShots;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(customListeners.class)
public class ScreenShotTest extends Base   {
	WebDriver driver;
@BeforeMethod
public void setUp() {
	initialisation();
}
@Test
public void takescreenShot() {
	Assert.assertEquals(false, true);
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
