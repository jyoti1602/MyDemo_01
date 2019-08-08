package Mypack99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class MyWeb_demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.linkText("REGISTER")).click();
		WebElement uname = driver.findElement(By.name("firstName"));
		uname.sendKeys("Jyoti");
		driver.findElement(By.name("lastName")).sendKeys("Rawat");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("wz-1375");
		driver.findElement(By.name("address2")).sendKeys("abcd");
		driver.findElement(By.name("city")).sendKeys("new delhi");
		driver.findElement(By.name("state")).sendKeys("delhi");
		driver.findElement(By.name("postalCode")).sendKeys("110057");
		//driver.findElement(By.name("country")).sendKeys("India");
	    Select cell= new Select(driver.findElement(By.name("country")));
	//    cell.selectByIndex(4);
	//cell.selectByValue("7");
	   cell.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.name("confirmPassword")).sendKeys("xyz");
		
		driver.findElement(By.name("register")).click();
		
		driver.close();

		
		String title = "Home";
        String  title1 = driver.getTitle();
        
       Assert.assertEquals(title, title1);
       System.out.println("pass");
       
       
       // exsit in selenium
          WebDriverWait wait1 = new WebDriverWait(driver,30);
          wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("error")));
	
	
	}

}
