package genricutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}
public void mouseHover(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();;
}
public void doubbleClick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
	public void selectDropdownByValue(WebElement element,String value) {
		Select sel=new Select(element)  ;
		sel.selectByValue(value);
	}
	public void selectDropdownByIndex(WebElement element,int index) {
		Select sel=new Select(element)  ;
		sel.selectByIndex(index);
	}
	public void selectDropdownByVisibleText(WebElement element,String text) {
		Select sel=new Select(element)  ;
		sel.selectByVisibleText(text);
	}
	public void dselectDropdownByValue(WebElement element,String value) {
		Select sel=new Select(element)  ;
		sel.deselectByValue(value);
	}
	public void dselectDropdownByindex(WebElement element,int index) {
		Select sel=new Select(element)  ;
		sel.deselectByIndex(index);
	}
	public void dselectDropdownByall(WebElement element) {
		Select sel=new Select(element)  ;
		sel.deselectAll();
	}
	public void dselectDropdownByVisibleText(WebElement element,String text) {
		Select sel=new Select(element)  ;
		sel.deselectByVisibleText(text);
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void switchToAlretAccept(WebDriver driver) {
		 driver.switchTo().alert().accept();
		
	}
	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public Alert SwitchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility utility=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+utility.getSystemTime()+"pang");
		FileHandler.copy(temp, dest);
		FileHandler.copy(temp, dest);
	}
	
}
