package execuationPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginPage;

public class ExecuationClass {
	
	@Test
	public void sampleTest() throws IOException {
		BaseClass.browserLaunch();
		LoginPage lo = new LoginPage();
		lo.url(lo.pro("site"));
		lo.typeText(lo.getUserName(), lo.pro("userName"));
		lo.typeText(lo.getPassWord(), lo.pro("passWord"));
		lo.elementClick(lo.getLoginBtn());
	}
	
	

}
