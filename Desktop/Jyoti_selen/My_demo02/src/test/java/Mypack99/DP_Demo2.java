package Mypack99;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class DP_Demo2 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String n, String s) {
	  driver.findElement(By.name("userName")).sendKeys(n);
	  driver.findElement(By.name("password")).sendKeys(s);
	  driver.findElement(By.name("login")).click();
  }
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
		// driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");  
	  driver.get("http://www.newtours.demoaut.com/");  	  
  }

@Test
public void verification() {
	String e_title = "Jyoti";
	String a_title = driver.getTitle();
	Assert.assertEquals(a_title, e_title);
	System.out.println("login");	
}
 @AfterClass
  public void closingApp() {
	  driver.close();
  }
   
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "mercury", "mercury" },
    };
  }
}
