package epsilon.WebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	//load the application
	driver.get("https://demo.actitime.com/login.do");
	
	org.openqa.selenium.WebElement un = driver.findElement(By.name("username"));
	
	//to type in the text field
	un.sendKeys("Bhoomika");
	
	//wait for few seconds
	Thread.sleep(3000);
	
	//to erase the text field
	un.clear();	
	
	//to get the tagName
	String tagName = un.getTagName();
	System.out.println(tagName);
	
	//to get the text
	org.openqa.selenium.WebElement gt = driver.findElement(By.id("headerContainer"));
	String text = gt.getText();
	System.out.println(text);
	
	//to get the attribute
	String attribute = gt.getAttribute("id");
	System.out.println(attribute);
	
	//to get css value
	String cs = gt.getCssValue("font-size");
	System.out.println(cs);
}
}
