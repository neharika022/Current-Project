package Demo_Selenium.Demo_Selenium;


//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class widget extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		//local webdriver i have created and i have replace the value of the browser intstantiated driver objected to it
		WebDriver driver = BrowserUtility.driver;
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
		waitForPageElementToVisible(ele);
		//driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		ele.click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Table')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//p[contains(text(),'Table')]")));
		//How to verify --> Assertion
		// you are expecting something and actually on that point of time what is coming
		if(driver.findElement(By.xpath("//p[contains(text(),'Table')]")).getText().trim().equals("Table"))
		{
			System.out.println("SUCCESS");
		}else {
			System.out.println("FAILURE");
		}
		
		//findelement, findelements
		/*List<WebElement> li_row1 =driver.findElements(By.xpath("//tbody/tr[1]"));
		for(int count=0;count<li_row1.size();count++) {
		System.out.println(li_row1.get(count).getText()+",");
		}
		List<WebElement> li_row2 =driver.findElements(By.xpath("//tbody/tr[2]"));
		for(int count=0;count<li_row2.size();count++) {
		System.out.println(li_row2.get(count).getText()+",");
		}
		List<WebElement> li_row3 =driver.findElements(By.xpath("//tbody/tr[3]"));
		for(int count=0;count<li_row3.size();count++) {
		System.out.println(li_row3.get(count).getText()+",");
		}
		
		List<WebElement> li_numRows =driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(li_numRows.size());
		System.out.println(li_numRows.get((li_numRows.size()-1)).getText());
*/		
		/*waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")));
		driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
		waitForPageElementToVisible(driver.findElement(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		driver.findElement(By.id("myInput")).sendKeys("united");
		//waitForPageElementToVisible(eleToWait);
		List <WebElement> liListOfCountries = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
		for(int count=0;count<liListOfCountries.size();count++)
		{
			if(liListOfCountries.get(count).getText().contains("United States of America"))
			{				
				liListOfCountries.get(count).click();
			}
			else {
				System.out.println(liListOfCountries.get(count).getText());
			}
		}*/
		//How to verify  
		
		Thread.sleep(10000);
		quitBrowser();
		
		/*
		 Observe more
		 you should think more
		 
		 * */
	}

}