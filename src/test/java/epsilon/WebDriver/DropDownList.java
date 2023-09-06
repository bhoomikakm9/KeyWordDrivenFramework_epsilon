package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//load the application
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		//create 
		Select sel = new Select(dropdown);
		sel.selectByIndex(4);
		
		Thread.sleep(3000);
		sel.selectByValue("7");
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Yellow");
		
		//multi select option
		WebElement carsdropdown = driver.findElement(By.id("cars"));
		Select se = new Select(carsdropdown);
		
		se.selectByValue("Volvo");
		
		Thread.sleep(3000);
		se.selectByValue("Saab");
		
        Thread.sleep(3000);
		se.selectByValue("audi");
		
		se.deselectByValue("Saab");
		
		
		
		
		
		
	}

}
