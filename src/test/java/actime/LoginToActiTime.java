package actime;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class LoginToActiTime {
	
	@Test
	public void loginToApp()
	{
		
		//launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//load the application
		driver.get("https://demo.actitime.com/login.do");
		
		//login to application
		LoginPage lp = new LoginPage(driver);
		/*
		lp.getUsernameEdt().sendKeys("admin");
		lp.getPwdEdt().sendKeys("manager");
		lp.getLoginBtn().click();
		System.out.println("login successfully");
		*/
		lp.loginToApp("admin", "manager");
		
		
		
		
	}

}
