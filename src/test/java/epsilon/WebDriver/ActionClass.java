package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		/*
		 this part is mouse hover
		//load the application
		driver.get("https://amazon.com");
		
		WebElement element = driver.findElement(By.xpath("//div[text()='EN']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		System.out.println("mouse hovering done");
		
		
		
		//this part is for double click
		driver.get("https://demoqa.com/buttons");
		WebElement ele = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		System.out.println("dou");
		
		// this part is for right click
		WebElement rytele = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rytele).perform();
		
		
		
		
		//drag and drop
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement srcElement = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		
		WebElement targetElement = driver.findElement(By.xpath("//div[text()='United States']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, targetElement).perform();
		
		
		//move anywhere on the webpage based on offset or coordinate value
		driver.get("https://makemytrip.com");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		System.out.println("popup closed");
		
		Thread.sleep(2000);
		act.moveByOffset(10,10).click().perform();
		System.out.println("popup closed");
		
		*/
		
		
	}

}
