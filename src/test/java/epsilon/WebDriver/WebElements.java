package epsilon.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

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
		//to go to navigate
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		//use for loop to check all the boxes
		List<WebElement> checkall = driver.findElements(By.xpath("//div[@class='img']"));
		
		for(int i =1;i<checkall.size();i++)
		{
			for(WebElement ele:checkall)
			{	
				ele.click();//second use get text instead of click
			}
		}
		System.out.println("all checkboxes are checked");
		
		
		
	}
}
