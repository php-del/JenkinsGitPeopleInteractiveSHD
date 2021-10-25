package shdtestpeopleinteractive;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserfactory {
public static WebDriver getInstance() throws MalformedURLException {
	WebDriver driver=null;
	
	switch (Constants.browsername.toUpperCase()) {
	case "CHROME": {System.setProperty("webdriver.chrome.driver", Constants.chromepath);
	driver=new ChromeDriver();}
	break;
	case "FIREFOX": {System.setProperty("webdriver.gecko.driver", Constants.firefoxpath);
	driver=new FirefoxDriver();}
	break;
	case "REMOTE" : { DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os_version", "Big Sur");
    caps.setCapability("resolution", "1920x1080");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "latest");
    caps.setCapability("os", "OS X");
    driver = new RemoteWebDriver(new URL(Constants.URL), caps);
	}
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
