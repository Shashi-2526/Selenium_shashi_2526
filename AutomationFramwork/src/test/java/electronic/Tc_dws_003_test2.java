package electronic;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genricutility.BaseClass;
import objecttrepository.HomePage;

public class Tc_dws_003_test2 extends BaseClass{
	@Test
	public void clickOnelectronic() {
		ExtentTest test = extReport.createTest("clickOnelectronic");
		hp=new HomePage(driver);
		hp.getElectronicslink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","Electronic page is not display");
		test.log(Status.PASS,"Electric page is display");
		
	}

}
