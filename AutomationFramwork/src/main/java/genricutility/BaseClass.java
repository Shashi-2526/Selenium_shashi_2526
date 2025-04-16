package genricutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objecttrepository.HomePage;
import objecttrepository.LoginPage;

public class BaseClass {
     public  static ExtentReports extReport;
     public static WebDriver driver;
     public JavaUtility utility=new JavaUtility();
     public WebDriverUtility wutility=new WebDriverUtility();
     public FileUtility futility=new FileUtility();
     public LoginPage lp;
     public HomePage hp;
     
@BeforeSuite
public void reportConfigration() {
	ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/Extendreport_"+utility.getSystemTime()+".html");
	extReport=new ExtentReports();
	extReport.attachReporter(spark);
}
 @BeforeClass
 public void OpenBrowser() throws IOException {
	 driver=new ChromeDriver();
	 wutility.maximize(driver);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get(futility.getDataFromproperty("url"));
 }
 @BeforeMethod
 public void login() throws IOException {
	 hp=new HomePage(driver);
	 hp.getLoginButton().click();
	 lp=new LoginPage(driver);
	 lp.getEmaliTextField().sendKeys(futility.getDataFromproperty("email"));
	 lp.getPwdTextField().sendKeys(futility.getDataFromproperty("password"));
	 lp.getLoginButton().click();
 }
 @AfterMethod
 public void logout() {
	 hp=new HomePage(driver);
	 hp.getLogoutButton().click();
 }
 @AfterClass
 public void closeBrowser(){
	 driver.quit();
 }
@AfterSuite
public void reportBackup() {
	extReport.flush();
}
}
