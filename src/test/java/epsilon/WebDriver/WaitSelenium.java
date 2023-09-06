package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitSelenium {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		/*
		//Implicitly wait in selenium
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://makemytrip.com");
				
		Actions act = new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		System.out.println("popup closed");
				
		act.moveByOffset(10,10).click().perform();
		System.out.println("popup closed");

		*/
		driver.get("https://makemytrip.com");
		Actions act = new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		System.out.println("popup closed");
				
		act.moveByOffset(10,10).click().perform();
		System.out.println("popup closed");
		
		//explicitly wait in selenium
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("MakeMyTrip"));
		
		
		
		
	}

}
