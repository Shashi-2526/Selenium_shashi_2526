package objecttrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Register")
	private WebElement registerButton;
	@FindBy(linkText = "Log in")
	private WebElement loginButton;
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booklink;
	@FindBy(partialLinkText = "Computers")
	private WebElement computerlink;
	@FindBy(partialLinkText = "Electronics")
	private WebElement electronicslink;
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCardsLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public WebElement getBooklink() {
		return booklink;
	}
	public WebElement getComputerlink() {
		return computerlink;
	}
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}
	
	
	


}
