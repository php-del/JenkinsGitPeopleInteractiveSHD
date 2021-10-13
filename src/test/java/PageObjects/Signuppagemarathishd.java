package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import shdtestpeopleinteractive.Syncutil;

public class Signuppagemarathishd {
@FindBy(xpath="//*[@name='email']")
WebElement emailid;

@FindBy(xpath="//*[@name='password1']")
WebElement password;

@FindBy(xpath="//*[@class='Dropdown-placeholder']")
WebElement createprofiledropdown;

@FindAll(@FindBy(xpath="//*[@role='option']"))
List<WebElement> valuesindropdown;


@FindBy(xpath="//*[@id='gender_male' and @type='radio']")
WebElement genderselection;


@FindBy(xpath="//*[@class='btn btn-primary btn-md btn-block common_btnShadow__1DkFC']")
WebElement nextbtn;


@FindBy(xpath="//*[@class='Dropdown-placeholder is-selected' and text()='Marathi']")
public static WebElement communitylanverification;

public void switchfrompanel1topanel2() {
	emailid.sendKeys("ppatharetest1@gmail.com");
	password.sendKeys("shiv@12356");
	createprofiledropdown.click();
	valuesindropdown.get(0).click();
	genderselection.click();
	
	
	Syncutil.Explicitwait(nextbtn);
	nextbtn.click();
}

}
