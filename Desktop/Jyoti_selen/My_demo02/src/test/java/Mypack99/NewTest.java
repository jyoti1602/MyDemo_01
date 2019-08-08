package Mypack99;



import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	 driver.findElement(By.linkText("SignIn")).click();
	 driver.findElement(By.id("userName")).sendKeys(n);
	 driver.findElement(By.id("password")).sendKeys(s);
	 driver.findElement(By.name("Login")).click();
	 
	
  }
 
  //@AfterMethod
  public void verification() {
	  String e_title = "Login";
		String a_title = driver.getTitle();
		Assert.assertEquals(a_title, e_title);
		System.out.println("login");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "demo", "demo" },
      new Object[] { "hello", "hello" },
    };
  }
  
  @AfterMethod
  public void closingApp() {
  driver.close();
  
  }
   
  @BeforeMethod
public void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\My Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();	
}
}
