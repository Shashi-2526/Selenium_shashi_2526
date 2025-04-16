package objecttrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id = "Email")
private WebElement emaliTextField;
@FindBy(id = "Password")
private WebElement pwdTextField;
@FindBy(xpath = "(//input[@type='submit'])[2]")
private WebElement loginButton;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getEmaliTextField() {
	return emaliTextField;
}
public WebElement getPwdTextField() {
	return pwdTextField;
}
public WebElement getLoginButton() {
	return loginButton;
}

}
