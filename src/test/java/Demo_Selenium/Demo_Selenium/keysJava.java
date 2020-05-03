package Demo_Selenium.Demo_Selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class keysJava extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		
		//Selenium WebDriver 3.0
		//
		//you can also press keys which is there in your keyboard. Using java. It is not at all recomended. Only for edge or corner cases we have to use it
		// You can also do it with keys
		//press s button and  release  --> S
		launchBrowser("ch");
		Thread.sleep(2000);
		Robot rb = new Robot();
		//VK --> Vartual keyboard
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_A); //--> to type a letter A
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_D); 
		rb.keyRelease(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_M); 
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_I); 
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_N); 
		rb.keyRelease(KeyEvent.VK_N);
		rb.keyPress(KeyEvent.VK_1); 
		rb.keyRelease(KeyEvent.VK_1);
		rb.keyPress(KeyEvent.VK_2); 
		rb.keyRelease(KeyEvent.VK_2);
		rb.keyPress(KeyEvent.VK_3); 
		rb.keyRelease(KeyEvent.VK_3);
		//rb.keyPress(KeyEvent.VK_AT); 
		//rb.keyRelease(KeyEvent.VK_AT);
		rb.keyPress(KeyEvent.VK_G); 
		rb.keyRelease(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_M); 
		rb.keyRelease(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_A); 
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_I); 
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_L); 
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_PERIOD); 
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_C); 
		rb.keyRelease(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_O); 
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_M); 
		rb.keyRelease(KeyEvent.VK_M);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		//File upload test cases we used to do that --> 
		//Robot class will work on focus basis  --> not Recomended
		//No gurantee whether it is success or not
		// Always recommended we have to ask the developers to write web elements/Automation supported codes
		
		//separate machines and with command lines.. 50% reliablity
		//This is recomended but can be used in browser only
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).sendKeys(Keys.ENTER);
		
		//70-75% of your test cases. you can still automate it. Assuming it is all one machine only. //different machine --> which is not possible
		//Download the file from browser. Download --> Selenium --> Downloads (.exe)--> // run this file // tab and enter. I use to install it successfully
		// if i refresh the page. it says it is installed or not
		//.exe  --> installers
		
		//Reporting --> TestNG, Validation, Screenshot 
		
		//Date picker --> Drag and drop is not working, Calculator functionality, 
		int date = 25;
		String str = "(//div[@class='weeks ']/div[4]//div[contains(text(),'"+date+"')])[2]";
		String strRaw="(//div[@class='weeks ']/div[4]//div[contains(text(),'25')])[2]"; // Everyone complete. --> but you guys have to try it
		driver.findElement(By.xpath(str)).click();
	}

} 