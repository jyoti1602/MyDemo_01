package casestudy1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class Scenario1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = Driver999.getDriver("chrome");
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.manage().window().maximize();
  }
}
