package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//load the application
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("bhoomika");
		
	}
}
