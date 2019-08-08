package Mypack99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mylaunch_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver;
       System.setProperty("webdriver.chrome.driver",
    		   "C:\\My Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.google.com");
//	driver.navigate().to("http://www.google.com");
	driver.close();
//	driver.quit();
	
	 System.setProperty("webdriver.gecko.driver",
  		   "C:\\My Drivers\\geckodriver-v0.24.0-win32\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.mozilla.org/");
//	driver.navigate().to("http://www.mozilla.org/");
	driver.close();
	
	 System.setProperty("webdriver.ie.driver",
  		   "C:\\My Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.get("www.internetexplorer.com");
//	driver.navigate().to("www.internetexplorer.com");
	driver.close();
	
	
	}
	

}
