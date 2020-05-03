package Demo_Selenium.Demo_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	public static WebDriver driver = null;
	
	static void launchBrowser(String sBrowser){
		
		if(sBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Neharika.exe");
		driver = new ChromeDriver();
		}
		
		else if(sBrowser.startsWith("e")) {
			WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
			
			}
			
			
			
		else {
			System.out.println("You have not given browser type correctly");
		}
		
		driver.manage().window().maximize(); 
		driver.get("https://qa-tekarch.firebaseapp.com/"); 
		
	}

	static void quitBrowser(){
		driver.quit();
	}
	static void loginToBrowser() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("admin123");
		String sText=driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText();
				System.out.println(sText);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));

	}
	
	static void waitForPageElementToVisible(WebElement eleToWait) {
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}
}