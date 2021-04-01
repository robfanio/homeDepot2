package homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_page {
	
	WebDriver driver;
	
	
	//ELEMENT LOCATORS
	@FindBy(linkText= "My Account")  public static WebElement account;
	@FindBy(linkText = "Register") public WebElement register;
	@FindBy(linkText = "Personal Account")public WebElement personalAccount;
	@FindBy(xpath = "//span[@class='bttn__content']")public WebElement selectContinue;
	@FindBy(id = "email")public WebElement email;
	@FindBy(id = "password-input-field")public WebElement password;
	@FindBy(id ="zipCode")	public	WebElement zipcode;
	@FindBy(id = "phone") public WebElement phone;
	@FindBy(xpath= "//span[@class='bttn__content' and text()='Create an Account']") public WebElement createAccount;
	
	
	
	//METHODS
	public Registration_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
}
	public  void ClickAccount() {
		account.click();
	}
	
	public void ClickRegister() {
		register.click();
	}
	
	public void SelectAccount() {
		selectContinue.click();
	}
	
	public void Email(String text) {
		email.sendKeys(text);
		
	}
	public void PassWordInput(String text) {
		password.sendKeys(text);
	}
	public void zipcodeInput(String number) {
		zipcode.sendKeys(number);
	}
	public void phoneInput(String number) {
		phone.sendKeys(number);
	}
	public void btnAcct() {
		createAccount.click();
	}
}