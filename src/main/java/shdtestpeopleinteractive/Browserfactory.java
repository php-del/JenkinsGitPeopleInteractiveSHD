package shdtestpeopleinteractive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
public static WebDriver getInstance() {
	WebDriver driver=null;
	
	switch (Constants.browsername.toUpperCase()) {
	case "CHROME": {System.setProperty("webdriver.chrome.driver", Constants.chromepath);
	driver=new ChromeDriver();}
	break;
	case "FIREFOX": {System.setProperty("webdriver.gecko.driver", Constants.firefoxpath);
	driver=new FirefoxDriver();}
		
		break;

	default:
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	if(Constants.browsername.equals("CHROME")) {
//		System.setProperty("webdriver.chrome.driver", Constants.chromepath);
//		driver=new ChromeDriver();
//	}
//	
//	if(Constants.browsername.equals("FIREFOX")) {
//		System.setProperty("webdriver.gecko.driver", Constants.firefoxpath);
//		driver=new FirefoxDriver();
//	}
	return driver;
}
}
