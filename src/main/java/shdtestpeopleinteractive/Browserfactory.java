package shdtestpeopleinteractive;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserfactory {
public static WebDriver getInstance() throws Exception {
	WebDriver driver=null;
	Properties p= new Properties();
	FileInputStream fs= new FileInputStream("F:\\Eclipse Java new Programs\\shdtestpeopleinteractive\\src\\main\\resources\\framework.properties");
	p.load(fs);
	
	switch (p.getProperty("browsername").toUpperCase()) {
	case "CHROME": {System.setProperty("webdriver.chrome.driver", p.getProperty("chromepath"));
	driver=new ChromeDriver();}
	break;
	case "FIREFOX": {System.setProperty("webdriver.gecko.driver", p.getProperty("firefoxpath"));
	driver=new FirefoxDriver();}
	break;
	case "REMOTE" : { DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os_version", "Big Sur");
    caps.setCapability("resolution", "1920x1080");
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "latest");
    caps.setCapability("os", "OS X");
    caps.setCapability("build", "BStack Build Number 1");
    driver = new RemoteWebDriver(new URL(p.getProperty("URL")), caps);
    //System.out.println(Constants.URL);
    
   System.out.println(((RemoteWebDriver) driver).getSessionId());
    
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
