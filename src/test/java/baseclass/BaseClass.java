package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	public static void browserLaunch() {
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jacki\\git\\pageObjectTestNG\\PageObjectModuel\\Driver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public  void url(String url) {
		driver.get(url);
	}
	
	public  void typeText(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	
	public void elementClick(WebElement element) {
		element.click();
	}
	
	public String pro(String Key) throws IOException {
		File file = new File("C:\\Users\\jacki\\eclipse-workspace\\Shoban\\PageObjectModuel\\src\\test\\resources\\loginCredentials.properties");
		FileInputStream fo = new FileInputStream(file);
		Properties po = new Properties();
		po.load(fo);
		String property = po.getProperty(Key);
		return property;
	
	}

}
