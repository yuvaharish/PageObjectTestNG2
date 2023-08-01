package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{

		public LoginPage() {
			PageFactory.initElements(driver, this);
		}

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement passWord;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}


	

}
