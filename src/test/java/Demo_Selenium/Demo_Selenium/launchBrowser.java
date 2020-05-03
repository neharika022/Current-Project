package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser {

	public static void main(String[] args) throws Exception {
		// 1.We have to launch browser
		// a. Downloading the driver exe file for the desired browser --> chrome browser
		// b. <artifactId>selenium-server</artifactId> <version>3.141.5</version> --> added to maven file
		// WebDriver driver = null;
	WebDriverManager.chromedriver().setup();
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\Neharika.exe");
		WebDriver driver = new ChromeDriver(); //--> This should launch my chrome browser. Make sure chrome browser should be there in your machine
		//2.you have to navigate to some url --> www.google.com
		driver.get("https://www.google.com");
		
		//3. maximize your window
		driver.manage().window().maximize();
		// Tekarch portal, google , gmail application, www.gmail.com, dev-gmail.com, qa02-gmail.com, qa01-gmail.com 
		driver.get("https://qa-tekarch.firebaseapp.com/"); 
		//it is first taking to some page and then redirecting back to login screen
		// learn more of our selenium concepts
		//how to take elements and then adding it to locators
		//chropath --> tool
		// chromdev tool --> you guys get to know how to select an element using chromedev tool
		// from there you know how to inspect also
		//seeing the implementation of that page
		// id is unique and preferable --> 
		
		//element="value"  locator = id
		//xapth
		
		//Send values to the box
		//you have to write xpath --> proper locators are not available. order -->
		//use that direction to reach you
		//1. starting from his resturant to till your house --> one way.
		//2. Best known place near to your home and you can ask him to navigate from there
		//xpath should match only one element
		Thread.sleep(5000); //--> early stage answer waits topics
		//EmailID: admin123@gmail.com
		//Password: admin123
		
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email...']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys("Srinidhi");
		//how to send keys
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("admin123");
		//how to get the text in website
		String sText=driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText();
				System.out.println(sText);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")).getText());
		
		//how to write an xpath on your own
		/*
		 // --> root element
		 //<tagName>
		 //<tagName>[]
		 //<tagName>[@<AttributeName>='<AttributeValue>']
		 */
		//how to click on button or elements
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Alert")).click();
		Thread.sleep(10000);
		//4. Close the browser
		//driver.close(); //--> it will close the current window
		driver.quit();  //-->quit the browser also instance of the browser
	
		
	}

}