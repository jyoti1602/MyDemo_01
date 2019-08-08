package Mypack99;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class links {
  WebDriver driver;
	
	@Test
  public void f() {
		driver=Drivers99.getDriver("chrome");
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int t_link = li.size();
		System.out.println(t_link);
		
		for(int i=0; i<t_link; i++) {
			String D_link= li.get(i).getText();
			System.out.println("the"+""+i+""+"at"+D_link);		
		}
		driver.close();
		
			
		
		
		
  }
}
