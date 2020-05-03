package Demo_Selenium.Demo_Selenium;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class popup extends BrowserUtility{

	public static void main(String[] args) throws Exception {

		launchBrowser("ch");
		loginToBrowser();
		WebDriver driver = BrowserUtility.driver;
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Windows')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//button[contains(text(),'Tab')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).click();
		ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());
		System.out.println(windowTabs.size()); 
		driver.switchTo().window(windowTabs.get(1));
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(windowTabs.get(0));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).getText());
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//button[@class='bootbutton'])[2]")).click(); // windows = 2
		ArrayList<String> windowTabs1 = new ArrayList(driver.getWindowHandles()); // windows = 2
		System.out.println(windowTabs1.size()); 
		driver.switchTo().window(windowTabs1.get(0)); // windows 1
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='bootbutton'])[2]")).click(); // windows =3
		windowTabs1 = new ArrayList(driver.getWindowHandles()); // windows =3
		System.out.println(windowTabs1.size());
		driver.switchTo().window(windowTabs1.get(2));
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.close();
		windowTabs1 = new ArrayList(driver.getWindowHandles()); // windows =2
		driver.switchTo().window(windowTabs1.get(1));
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(windowTabs1.get(0));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//button[@class='bootbutton'])[2]")).getText());
		Thread.sleep(10000);
		//IFrame
		driver.get("http://the-internet.herokuapp.com/iframe");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr"))); //you have to ask developer
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//body/p")).getText());
	}
}