package Demo_Selenium.Demo_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {
	//static WebDriver driver;

	public static void main(String[] args) throws Exception{

		
		/* set system properity for chrome browser  */
		WebDriverManager.chromedriver().setup();
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\Neharika.exe");
		WebDriver driver=new ChromeDriver();           // launch Chrome browser
		System.out.println("Chrome browser launched..");
		driver.get("https://qa-tekarch.firebaseapp.com");    // pass url
		System.out.println("App URL passed..");
		driver.manage().window().maximize();  // to maximize the chrome browser
		System.out.println("Browser get maximizded..");
		Thread.sleep(5000);                   // wait (pause in execution) for 5 sec
//		driver.manage().deleteAllCookies();
/*		driver.findElement(By.id("email_field")).sendKeys("Akshay");
		driver.findElement(By.id("")).sendKeys("Kumar");*/
		
		WebElement email=driver.findElement(By.id("email_field"));
		email.sendKeys("admin123@gmail.com");  // action 1
		Thread.sleep(3000);
		/*email.clear();             // action 2
		Thread.sleep(3000);
		email.sendKeys("Kumar");   // action 3
*/		
	driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys("admin123");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]"));
		System.out.println("Login button= "+loginButton.isEnabled());
		loginButton.click();
		
		Thread.sleep(2000);
		
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("SAI SRI");
		Thread.sleep(2000);
		
		WebElement FatherName= driver.findElement(By.id("lname"));
		FatherName.sendKeys("JAI RAM");
		Thread.sleep(2000);
		
		WebElement postaladdress = driver.findElement(By.id("postaladdress"));
		postaladdress.sendKeys("San Roman,CA");
		Thread.sleep(2000);
		
		WebElement personaladdress = driver.findElement(By.cssSelector("#personaladdress"));
		personaladdress.sendKeys("54322 Alcosta Bulevard ");
		Thread.sleep(2000);
		
		WebElement Sex_male = driver.findElement(By.xpath("//span[1]//input[1]"));
		System.out.println("Male= "+Sex_male.isSelected());   // true (default value of Sex (Radio button))
		
		WebElement Sex_Female = driver.findElement(By.xpath("//span[2]//input[1]"));
		System.out.println("Female= "+Sex_Female.isSelected());  // false
		Thread.sleep(2000);
		Sex_Female.click();
		
		WebElement City=driver.findElement(By.xpath("//select[@id='city']"));
		Select dropDown1=new Select(City);
		dropDown1.selectByIndex(4);
	//	dropDown1.selectByValue("newdelhi");
	//	dropDown1.selectByVisibleText("GOA");
		
		WebElement Course = driver.findElement(By.cssSelector("#course"));
		Select dropDown2= new Select(Course);
		dropDown2.selectByIndex(1)	;
		
		WebElement District = driver.findElement(By.id("district"));
		Select dropDown3 = new Select (District);
		dropDown3.selectByIndex(1)	;
		
		WebElement State=driver.findElement(By.xpath("//select[@id='state']"));
		Select dropDown4= new Select(State);
		dropDown4.selectByIndex(2)	;
		
		WebElement pincode = driver.findElement(By.xpath("//input[@id='pincode']"));
		pincode.sendKeys("94588");
		Thread.sleep(2000);
		
		WebElement emailid = driver.findElement(By.id("emailid"));
		emailid.sendKeys("support.help@hotmail.com");
	
		Thread.sleep(3000);
		WebElement bootButton=driver.findElement(By.className("bootbutton"));
		System.out.println("boot button= "+bootButton.isEnabled());
		bootButton.click();
	
		Thread.sleep(3000);
		driver.quit();                        // disconnect all connection and close the browser
	}
}