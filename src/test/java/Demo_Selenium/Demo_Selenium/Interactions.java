

package Demo_Selenium.Demo_Selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions {

	public static void main(String[] args) throws Exception {
		BrowserUtility.launchBrowser("ch");
		BrowserUtility.loginToBrowser();
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]"))));
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]")).click();
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"))));
		WebElement ele = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
	
		Thread.sleep(3000);
		Actions act = new Actions(BrowserUtility.driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(2000);
	
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		//WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Double Click')]"))));
		
		BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();

		wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]"))));
		
		Thread.sleep(2000);
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]")).click();
		BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'single Click')]")).click();
		Thread.sleep(2000);
		
		WebElement eleDoubleClick = BrowserUtility.driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		Actions act1 = new Actions(BrowserUtility.driver);
		act1.doubleClick(eleDoubleClick).build().perform(); // =1-->3 -->5
		Thread.sleep(1000);
		act1.doubleClick(eleDoubleClick).build().perform();
		Thread.sleep(1000);
		act1.doubleClick(eleDoubleClick).build().perform();
		Thread.sleep(10000);
		BrowserUtility.quitBrowser();
		//How many of you know waht is bug?
		// i want you guys to address these kind of bugs or as an improvement
		// By emailing srinidhi.b@tekarch.com
		// Bug Found : Mar2020 		//Improvement Found : Mar2020   --> it will be easy for us to implemment better
		// maximum bug or improvements in that tool.
		
		/*
		 locators, waits, mouse hover, single click and double click
		 
		 Tables
		 * */
	}

}
