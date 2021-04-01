package homedepot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base {
	WebDriver driver;
	Registration_page register;

	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(@Optional("Chrome")String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "drivers\\chromedriverv88.exe");
			driver = new ChromeDriver();
			driver.get("http://www.homedepot.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
			register = new Registration_page(driver);
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://www.homedepot.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
			register = new Registration_page(driver);
		}else {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriverv88.exe");
			driver = new ChromeDriver();
			driver.get("http://www.homedepot.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4L, TimeUnit.SECONDS);
			register = new Registration_page(driver);
		}
		
		

	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

}
