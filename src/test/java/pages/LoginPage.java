package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
public LoginPage(){
	PageFactory.initElements(Driver.getDriver(),this);
	
}
@FindBy(xpath = "//div[@class='g5shop_header-action-icon g5shop__header-action-my-account']")
public WebElement loginButton;

@FindBy (xpath = "//input[@name='username']")
public WebElement usernameBox;

@FindBy (xpath = "//input[@name='password']")
public WebElement passwordBox;

@FindBy (xpath = "(//button[@type='submit'])[1]")
public WebElement login;
}
