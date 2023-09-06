package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//load the application
		driver.get("https://demo.actitime.com/login.do");
		
		//user name
		WebElement us = driver.findElement(By.id("username"));
		us.sendKeys("admin");
		
		//password
		WebElement ps = driver.findElement(By.name("pwd"));
		ps.sendKeys("manager");
		
		//login click
		WebElement loginTextField = driver.findElement(By.id("loginButton"));
		loginTextField.click();
				
		Thread.sleep(5000);
		
		driver.findElement(By.id("container_tasks")).click();
		
		
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='copyTo button']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ok button']/following-sibling::div[@class='cancel button'])[5]")).click();
	}

}
