package alphaPackage;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class Listeners implements ITestListener {

	Base b = new Base();
	
	public void onTestStart() {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess() {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		try {
			b.takeScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped() {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedButWithinSuccessPercentage() {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout() {
		// TODO Auto-generated method stub
		
	}

	public void onStart() {
		// TODO Auto-generated method stub
		
	}

	public void onFinish() {
		// TODO Auto-generated method stub
		
	}
	
	

}
