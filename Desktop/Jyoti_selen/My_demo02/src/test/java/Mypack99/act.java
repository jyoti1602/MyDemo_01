package Mypack99;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class act {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver =  Drivers99.getDriver("chrome");
	 // driver.get("https://www.spicejet.com/?gclid=EAIaIQobChMIlajavezj4wIVWSQrCh0PAQRaEAAYASAAEgJ_-vD_BwE");
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  
	  driver.manage().window().maximize();
	//WebElement webe =   driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  //Actions act1 = new Actions(driver);
	  //act1.moveToElement(webe).build().perform();
	  
	//  WebElement webb = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
	//  boolean b = webb.isSelected();
	//  System.out.println(b); 
	  //WebElement webb = driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[7]/div/span/label"));
	//act1.doubleClick(webb).build().perform();
	
	  WebElement src =   driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_RadTreeView1\']/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	  WebElement dest =   driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_RadGrid1_ctl00']/tbody/tr/td"));
	  
	  Actions act1 = new Actions(driver);
	  act1.dragAndDrop(src, dest).build().perform();
           Thread.sleep(50000);
       WebElement price = driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_RadGrid1_ctl00\']/tfoot/tr/td[2]"));
           System.out.println(price);
           Assert.assertNotEquals("$50", price);
           driver.close();
	  
  
  
  }
  
  
}
