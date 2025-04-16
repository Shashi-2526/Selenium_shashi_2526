package Computer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genricutility.BaseClass;
import objecttrepository.HomePage;

public class Tc_dws_002_test extends BaseClass{
	@Test
	public void clickonComputerLink() {
		ExtentTest test = extReport.createTest("clickonComputerLink");
		hp=new HomePage(driver);
		hp.getComputerlink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","computer page is not display");
		test.log(Status.PASS,"computer page is display");
		
	}

}
