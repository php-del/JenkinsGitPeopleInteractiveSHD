package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepageclasses.BasePage;


public class Marathishd extends BasePage {
	
	public Marathishd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//*[@class='btn-primary form-control']")
WebElement letsbeginbtn;


public Signuppagemarathishd letsbeginclick() {
	letsbeginbtn.click();
	return PageFactory.initElements(getpagedriver(), Signuppagemarathishd.class);
}
}
