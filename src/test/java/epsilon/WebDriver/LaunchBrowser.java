package epsilon.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();//it will download the updated driver executable
		WebDriver driver = new EdgeDriver();//both line will always be together
		
		//to get maximize, minimize and full screen we use this 
		driver.manage().window().maximize();
				
		//load the application - get()
		driver.get("https://flipkart.com");
		System.out.println("Flipkart loaded");
		
		//to get the page title - getTiltle()
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the current URL of the page - grtCurrentUrl()
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to get the page source code - getPageSource()
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		//to get the window handle - getWindowHandle() //complete dynamic information every time we launch windowID will get updated
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		//driver.findElement(By.)
		
		//driver.quit();//close all the existing tabs and browsers
		//System.out.println("browser closed");
		
		// to navigate we use driver.navigate().back()
	//	driver.close();//close only the current window //better to use quit than close
	}
	
}
