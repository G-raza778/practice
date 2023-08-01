package listenersTakingScreenShots;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class customListeners extends Base implements ITestListener{
@Override
public void onTestFailure(ITestResult result) {
	System.out.println("Test Case is failed");
	failed();
}
}
	