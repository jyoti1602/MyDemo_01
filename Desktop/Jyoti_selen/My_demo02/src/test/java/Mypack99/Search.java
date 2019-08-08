package Mypack99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Search {
	WebDriver driver;
  @Test(enabled = false)
  public void f() throws InterruptedException {
	  driver = Drivers99.getDriver("chrome");
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 WebElement trgt =  driver.findElement(By.id("small-searchterms"));
		 Actions act = new Actions(driver);
		 act.keyDown(trgt, Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
		  Thread.sleep(5000);
		  act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
  
  @Test
  public void Mul() {
	  driver.get("http://www.newtours.demoaut.com/");
		 driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("REGISTER")).click();
		  driver.findElement(By.cssSelector("select[name='country']"));
  }
}
