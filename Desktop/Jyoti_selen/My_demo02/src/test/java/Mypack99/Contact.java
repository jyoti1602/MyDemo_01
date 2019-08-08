package Mypack99;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Contact {
	WebDriver driver;
  @Test(enabled=false)
  public void f() {
	  driver =  Drivers99.getDriver("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	  driver.manage().window().maximize();
	  
	  String p_window= driver.getWindowHandle();
		 System.out.println(p_window);
		  driver.findElement(By.xpath("//*[@id='menu3']/li[3]/a/span")).click();
		 Set<String> t_window = driver.getWindowHandles();
		
		  for(String s: t_window) {
			  driver.switchTo().window(s);
			  System.out.println(driver.getWindowHandles());
		  }
		  driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a/span")).click();
driver.findElement(By.xpath("//*[@id='menu3\']/li[3]/ul/li/ul/li[1]/a")).click();

  }
  
  @Test
  public void AlertDemo() {
	  driver =  Drivers99.getDriver("chrome");
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("searchBtn")).click();
	 
	if(ExpectedConditions.alertIsPresent()!=null) {  
	Alert alt1 = driver.switchTo().alert();
	  String S1 = alt1.getText();
	  System.out.println(S1);
	  alt1.accept();
	}
	else
	{
		System.out.println("No alerts present in the given page");
		
	}
  }
}