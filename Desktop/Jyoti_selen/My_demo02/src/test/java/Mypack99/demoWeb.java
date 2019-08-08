package Mypack99;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class demoWeb {
	WebDriver driver;
  @Test
  public void f() {
	  driver=Drivers99.getDriver("chrome");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//label[@for='gender-female']")).click();
		
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Jyoti");
        driver.findElement(By.cssSelector("input#LastName")).sendKeys("Rawat");
        driver.findElement(By.id("Email")).sendKeys("xyz321@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("abcd@123");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("abcd@123");
        driver.findElement(By.name("register-button")).click();
      //  driver.findElement(By.cssSelector("input[id='register-button']")).click();
       //driver.findElement(By.cssSelector("input.button-1 register-next-step-button")).click();
		
  }
}
