package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Gujaratishd;
import PageObjects.Marathishd;
import PageObjects.Signuppagegujaratishd;
import PageObjects.Signuppagemarathishd;
import shdtestpeopleinteractive.BaseTest;
import shdtestpeopleinteractive.Syncutil;
import shdtestpeopleinteractive.csvreaderutil;

public class Testcases_shd_test extends BaseTest {

	
	@Test(priority=1)
	public void mothertongueverificationmarathi() {
		Syncutil.Implicitwait();
		try {
		getdriver().get("https://www."+csvreaderutil.csvread().get(0).toString()+"/");
		Marathishd marathishdpage = PageFactory.initElements(getdriver(), Marathishd.class);
		Signuppagemarathishd signup = marathishdpage.letsbeginclick();
		signup.switchfrompanel1topanel2();
		Assert.assertEquals(signup.communitylanverification.getText(),"Marathi");
		Syncutil.wait(5);
		}catch(Exception e) {System.out.println("Exception");}
	}
	
	@Test(priority=2)
	public void mothertongueverificationgujarati() {
		Syncutil.Implicitwait();
		try {
		getdriver().get("https://www."+csvreaderutil.csvread().get(1).toString()+"/");
		Gujaratishd gujaratishdpage = PageFactory.initElements(getdriver(), Gujaratishd.class);
	    Signuppagegujaratishd signup=gujaratishdpage.letsbeginclick();
	    signup.switchfrompanel1topanel2();
		Assert.assertEquals(signup.communitylanverification.getText(),"Gujarati");
		Syncutil.wait(5);
		Syncutil.wait(5);
		
		}catch(Exception e) {System.out.println("Exception");}
	}
}
