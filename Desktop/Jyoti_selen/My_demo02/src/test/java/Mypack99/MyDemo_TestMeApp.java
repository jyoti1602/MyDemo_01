package Mypack99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyDemo_TestMeApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("SignUp")).click();;
		driver.findElement(By.id("userName")).sendKeys("abcd");
		driver.findElement(By.id("firstName")).sendKeys("Jyoti");
		driver.findElement(By.id("lastName")).sendKeys("Rawat");
		driver.findElement(By.id("password")).sendKeys("abcde");
		driver.findElement(By.name("confirmPassword")).sendKeys("abcde");
		
		driver.findElement(By.xpath("//input[@value='Female']")).click();	
		
		driver.findElement(By.id("emailAddress")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		driver.findElement(By.name("dob")).sendKeys("12/24/1997");
		driver.findElement(By.id("address")).sendKeys("wz-1375 abcd");
        Select cell = new Select(driver.findElement(By.name("securityQuestion")));
        cell.selectByIndex(1);
        driver.findElement(By.id("answer")).sendKeys("Black");
        driver.findElement(By.name("Submit")).click();
        
        driver.close();
        
        

		
		
		
		
		
		

	}

}
