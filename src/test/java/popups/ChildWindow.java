package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		

		// Step 2: Load the URL
		driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
		
		//Step 3: Navigate to seperate window
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		//Step 3: click 
		driver.findElement(By.xpath("//button[.='click']")).click();
		
		//Step 4:capture the main window ID
		String mainWindowID = driver.getWindowHandle();
		System.out.println(mainWindowID);
		
		//Step 5: capture all the window IDs
		Set<String> allWindowIDs = driver.getWindowHandles();
		
		for(String winId:allWindowIDs)
		{
			if(!winId.equals(mainWindowID))
			{
				driver.switchTo().window(winId);
				System.out.println("control switched to child");
				System.out.println(winId);
				break;
			}
			
		}
		
		//click on downloads in Child window
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		
		//Switch the control back to main window
		driver.switchTo().window(mainWindowID);
		
		//Click on register in main window
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		
	}
}
