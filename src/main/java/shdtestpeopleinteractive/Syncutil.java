package shdtestpeopleinteractive;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncutil extends BaseTest {
	
	
public static void wait(int sec) {
	try {
	Thread.sleep(sec*1000);
}
	catch(Exception e) {
		System.out.println("Exception");
	}
}

public static void Explicitwait(WebElement element) {
	WebDriverWait wait=new WebDriverWait(getdriver(), 30);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public static void  Implicitwait() {
	getdriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

}
