package giftcards;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genricutility.BaseClass;
import objecttrepository.HomePage;

public class Tc_dws_004_test extends BaseClass{
 @Test
 public void clickOnGiftCards() {
	 ExtentTest test = extReport.createTest("clickOnGiftCards");
	 hp=new HomePage(driver);
	 hp.getGiftCardsLink().click();
	 Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Gift Cards","Gift page is not display");
	 test.log(Status.PASS,"Gift page is displayed");
 }
}
