package Book;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genricutility.BaseClass;
import objecttrepository.HomePage;

public class Tc_dws_001_test extends BaseClass{
@Test
public void ClickonBooks () {
	//WebDriver driver=new ChromeDriver();
	ExtentTest test = extReport.createTest("clickonBook");
	hp=new HomePage(driver);
	hp.getBooklink().click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Book page is not display");
	test.log(Status.PASS, "book page is display");
	
	

}
}
