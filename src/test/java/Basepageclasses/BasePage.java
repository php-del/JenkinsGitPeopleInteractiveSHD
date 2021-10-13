package Basepageclasses;

import org.openqa.selenium.WebDriver;

public class BasePage {
private WebDriver driver;

public BasePage(WebDriver driver) {
	this.driver=driver;
}

public WebDriver getpagedriver() {
	return driver;
}

}
