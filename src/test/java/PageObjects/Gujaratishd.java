package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepageclasses.BasePage;

public class Gujaratishd extends BasePage {
	public Gujaratishd(WebDriver driver) {
		super(driver);
		
	}

@FindBy(xpath="//*[@class='btn-primary form-control']")
WebElement letsbeginbtn;


public Signuppagegujaratishd letsbeginclick() {
	letsbeginbtn.click();
	return PageFactory.initElements(getpagedriver(), Signuppagegujaratishd.class);
}
}
