package Mypack99;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowDemo {
	WebDriver driver;
	
  @Test(enabled=false)
  public void f() {
	  driver =  Drivers99.getDriver("chrome");
	  driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  driver.manage().window().maximize();
	 String p_window= driver.getWindowHandle();
	 System.out.println(p_window);
	  driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/HomeLoanButton.png']")).click();
	 Set<String> t_window = driver.getWindowHandles();
	  for(String s: t_window) {
		  driver.switchTo().window(s);
		  System.out.println(driver.getWindowHandles());
	  }
	  
	  driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[8]/a")).click();
	//  driver.findElement(By.linkText("Apply Now")).click();
	 // driver.close();	  
	//  driver.quit();
  }
	  @Test
	  public void frames() {
		  driver =  Drivers99.getDriver("chrome");
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		  driver.manage().window().maximize();
		  driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		  driver.findElement(By.xpath("//button[text()='Click me to display Date and Time']")).click();
		  driver.switchTo().defaultContent();
		  
	  }
 
}
