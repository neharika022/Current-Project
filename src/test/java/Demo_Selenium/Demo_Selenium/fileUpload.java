package Demo_Selenium.Demo_Selenium;


import org.openqa.selenium.By;
public class fileUpload extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		//In previous developers concept. They have (chooseButton) [along path of the file to be ther in another place holder]
		//he is letting to know only file name
		
		/*driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='upfile']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("C:\\Users\\hanuma\\Downloads\\jenkins.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);*/

		//Upload button is not there to upload it. But it is auto-uploading. //.jpg , jpeg, 
		
		//wait --> webElement  -> Fluent wait, Explicit wait --> we may not right txpath, 5sec, That given id not visibles
		//alert window --> Thread.sleep --> Time frequency
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")));
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		waitForPageElementToVisible(driver.findElement(By.id("logo")));
		Thread.sleep(5000);
		driver.findElement(By.id("logo")).sendKeys("C:\\Users\\hanuma\\Downloads\\jenkins.png");
		Thread.sleep(5000);
		//Wait for upload bar to disappear
		driver.findElement(By.xpath("//button[@class='bootbutton']")).click();
		Thread.sleep(5000);		
		
	}

}