package clientbased;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

// public class FirstTest {
//         @Test
// 	public void webDriverManagerChrome()
// 	{
// 		WebDriverManager.chromedriver().setup();
// 		WebDriver driver = new ChromeDriver();
// 		driver.manage().window().maximize();
// 		driver.manage().deleteAllCookies();
			
// 		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
// 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
// 		driver.get("https://classic.crmpro.com/index.html");
//          }
// }

public class FirstTest {
    @Test
	public void test() throws IOException,InterruptedException{
	//        WebDriver driver;
	//	System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
options.addArguments("--disable-infobars");
options.addArguments("--crash-dumps-dir=/tmp");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--no-sandbox");
options.addArguments("--remote-debugging-port=9222");
                WebDriver driver = new ChromeDriver(options);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://dev.productively.app/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("clientbasedtest@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing@13");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
	      AssertJUnit.assertEquals(driver.findElement(By.tagName("h4")).getText(), "Start Tracking Time");
		System.out.println(driver.findElement(By.tagName("h4")).getText());
	}
   @Test(groups = { "demo" })	
   public void test1() {
   	System.out.println("check group1");
   }
   @Test(groups = { "demo" })	
   public void test2() {
   	System.out.println("check group2");
   }
   @Test(priority=2)
   public void test3() {
   	System.out.println("check priority2");
   }
   @Test(priority=1)
   public void test4() {
   	System.out.println("check priority1");
   }
   @Test(invocationCount=5)
   public void test5() {
   	System.out.println("check invocation");
   }
   @Test(enabled=false)
   public void test6() {
   	System.out.println("enabled the testcase");
   }
   @Test
	public void createclient() {
		  driver.findElement(By.xpath("//a[text()='Clients']")).click();
		 //click on add client button
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         
        //send name
         driver.findElement(By.xpath("//input[@name='name']")).sendKeys("client-1");
        
        //send address
        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("gota");
        
        //contact name
        driver.findElement(By.xpath("//input[@name='contact_name']")).sendKeys("mrai");
        
        //email
         driver.findElement(By.xpath("//input[@name='contact_email']")).sendKeys("abc@gmail.com");
        
        //select currency
         driver.findElement(By.xpath("//mat-select[@formcontrolname='currency']")).click();
        
         driver.findElement(By.xpath("//span[text()=' INR ']")).click();
        
        //number
        // await driver.findElement(By.xpath("//input[@name='contact_number']")).sendKeys(8764128989);
        // await driver.sleep(2000);
        //hourely rate
         driver.findElement(By.xpath("//input[@name='hourly_rate']")).sendKeys("2");
        
        //click on create button
         driver.findElement(By.xpath("//span[text()='Create']")).click();
        
	}
    
}












