package clientbased;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/home/hp-021/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		driver.get("https://dev.productively.app/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("clientbasedtest@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing@13");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		AssertJUnit.assertEquals(driver.findElement(By.tagName("h4")).getText(), "Start Tracking Time");
		System.out.println(driver.findElement(By.tagName("h4")).getText());
	}
//    @Test(groups = { "demo" })	
//    public void test1() {
//    	System.out.println("check group1");
//    }
//    @Test(groups = { "demo" })	
//    public void test2() {
//    	System.out.println("check group2");
//    }
//    @Test(priority=2)
//    public void test3() {
//    	System.out.println("check priority2");
//    }
//    @Test(priority=1)
//    public void test4() {
//    	System.out.println("check priority1");
//    }
//    @Test(invocationCount=5)
//    public void test5() {
//    	System.out.println("check invocation");
//    }
//    @Test(enabled=false)
//    public void test6() {
//    	System.out.println("enabled the testcase");
//    }
    
}












