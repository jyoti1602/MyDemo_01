package Mypack99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver =  Drivers99.getDriver("chrome");
	  driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe")));
	  WebElement src = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));	
	  WebElement dest = driver.findElement(By.xpath("//*[text()='Trash']"));
	  Actions act1 = new Actions(driver);
	  act1.dragAndDrop(src, dest).build().perform();
	  
  }
}
