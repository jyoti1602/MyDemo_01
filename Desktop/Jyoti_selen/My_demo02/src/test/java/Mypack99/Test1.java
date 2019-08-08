package Mypack99;

import java.util.Set;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Drivers99.getDriver("chrome");
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  String p_window= driver.getWindowHandle();
	  System.out.println(p_window);
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\'menu3\']/li[3]/a"))).
	  moveToElement(driver.findElement(By.xpath("//*[@id='menu3']/li[3]/ul/li/a"))).build().perform();
	  driver.findElement(By.xpath("//*[@id=\'menu3\']/li[3]/ul/li/ul/li[1]/a")).click();
	  
	 Set<String> t_window = driver.getWindowHandles();
	 for(String s: t_window) {
		  driver.switchTo().window(s);
		  System.out.println(driver.getWindowHandles());
	  }
	 
	 Assert.assertTrue(driver.getCurrentUrl().contains("chn"));
	 
	//String s1 = driver.findElement(By.xpath("//*[@id=\'demo3\']/b/p[1]"));
//String s2 = driver.findElement(By.xpath("//*[@id=\'demo3\']/b/p[2]"));
	//String s3 = driver.findElement(By.xpath("//*[@id=\'demo3\']/b/p[3]"));
	//String s4 = driver.findElement(By.xpath("//*[@id=\'demo3\']/b/p[4]"));
	//String s5 = driver.findElement(By.xpath("//*[@id=\'demo3\']/b/p[5]"));
	//String s6 = driver.findElement(By.xpath("//*[@id=\'demo3\']/b/p[6]"));
	
	//System.out.println(s1);
	//System.out.println(s2);
//	System.out.println(s3);
//	System.out.println(s4);
	//System.out.println(s5);
	//System.out.println(s6);	  
	//driver.close();
  }
}

