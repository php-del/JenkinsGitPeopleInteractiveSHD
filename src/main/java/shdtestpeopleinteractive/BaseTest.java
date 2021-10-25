package shdtestpeopleinteractive;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
static HashMap<String,WebDriver>  drivermap= new HashMap<String,WebDriver>();

@BeforeMethod
public void launchbrowser() throws MalformedURLException {
	WebDriver driver= Browserfactory.getInstance();
	driver.manage().window().maximize();
	drivermap.put(Thread.currentThread().getName(), driver);
	
}

@AfterMethod
public void quitbrowsersession() {
	
	if(getdriver()!=null) {
		getdriver().quit();
	}
}

protected static WebDriver getdriver() {
	return drivermap.get(Thread.currentThread().getName());
}
}
