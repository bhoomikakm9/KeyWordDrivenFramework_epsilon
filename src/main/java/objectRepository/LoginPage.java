package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {//rule 1: create a separate pom class for a web page
	
	
	//rule 2: identify the web element using @finfBy annotation
	@FindBy(name = "username") //identify it
	private WebElement usernameEdt;// and store it in reference variable
	
	@FindBy(name = "pwd")//identify
	private WebElement pwdEdt;//Storing
	
	@FindBy(id = "loginButton")//identify
	private WebElement loginBtn;//storing
	
	
	//rule 3: create a constructor for element initialization 
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//rule 4: provide getters

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPwdEdt() {
		return pwdEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//business library
	public void loginToApp(String USERNAME,String PASSWORD) {
		
		usernameEdt.sendKeys(USERNAME);
		pwdEdt.sendKeys(PASSWORD);
		loginBtn.click();
	
	}
	
}