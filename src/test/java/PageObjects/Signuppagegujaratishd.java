package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import shdtestpeopleinteractive.Excel_Util;
import shdtestpeopleinteractive.Syncutil;

public class Signuppagegujaratishd {
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


	@FindBy(xpath="//*[@class='Dropdown-placeholder is-selected' and text()='Gujarati']")
	public static WebElement communitylanverification;

	public void switchfrompanel1topanel2() {
		try {
		emailid.sendKeys(Excel_Util.readexcelretlist().get(2));
		password.sendKeys(Excel_Util.readexcelretlist().get(3));
		createprofiledropdown.click();
		valuesindropdown.get(0).click();
		genderselection.click();
		
		
		Syncutil.Explicitwait(nextbtn);
		nextbtn.click();
	}catch(Exception e) {e.printStackTrace();}
	}

	}

