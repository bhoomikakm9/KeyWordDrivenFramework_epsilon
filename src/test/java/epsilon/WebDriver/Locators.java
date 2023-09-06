package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the application
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("application launched");
		
		//identify the username text field
		WebElement usernameTextField = driver.findElement(By.cssSelector("input[name='username']"));
		//WebElement usernameTextField = driver.findElement(By.id("username"));
		System.out.println("username identified");
		
		//identify the password text field
		//WebElement passwordTextField = driver.findElement(By.className("pwdfield"));
		System.out.println("password identified");
		
		//find element by css Selector
		//WebElement passwordTextField = driver.findElement(By.xpath("//input[@type='password']")); //single attribute
		//WebElement passwordTextField = driver.findElement(By.xpath("(//input[@type='password'])[1]")); //single attribute with indexing
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@type='password' and @name='pwd']"));//multiple attribute
		
		
		//identify the login link in form of button
		WebElement loginTextField = driver.findElement(By.id("loginButton"));
		System.out.println("login clickes");
		
		//to enter data
		usernameTextField.sendKeys("trainee");
		passwordTextField.sendKeys("trainee");
		loginTextField.click();
		
		//link text .click() is used to click on the forgot password part so it redirects us to the next page
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//WebElement emailTextField = driver.findElement(By.id("forgetPasswordEmailOrUsername"));
		//emailTextField.sendKeys("bhoomika");
	}
	
}
