package Demo_Selenium.Demo_Selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Switchto extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		//local webdriver i have created and i have replace the value of the browser intstantiated driver objected to it
		WebDriver driver = BrowserUtility.driver;
				waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
			waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")));
		driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")).click();
		Thread.sleep(2000);//--> Browser allows only one button  --> OK, cancel
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]")));
		WebElement ele = driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);//developers 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]")).click();
		Thread.sleep(2000);
		quitBrowser();
		
		//Automation --> Manual it is working 
		
		//File upload ---> date picker
		
		/*
		 Table, autocomplete, alerts,
		 //wait, wrong element
		  
		 Scrollable --> 
		 Popups -->
		 keys -->
		  
		 * */
	}

}