package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class DataProvider {
	
	
	@Test(dataProvider = "getData")
	public void sample(String username, String password)
	{
		System.out.println("username ->"+username+" and password ->"+password);
	
	
		//launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
				
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				
		//load the application
		driver.get("https://demo.actitime.com/login.do");
				
		//login to application
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(username, password);
		
		
		//validate for home page title
		//String ExpTitle = "actiTIME -  Enter Time-Track";
		String ActTitle = driver.getTitle();
		
		//Assert.assertEquals(ActTitle, ExpTitle);
		
		Assert.assertTrue(ActTitle.contains(password));
		System.out.println("success");
		
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="manager";
		
		data[1][0]="trainee";
		data[1][1]="trainee";
		
		data[2][0]="hii";
		data[2][1]="hello";
		
		return data;
	
	}

}
