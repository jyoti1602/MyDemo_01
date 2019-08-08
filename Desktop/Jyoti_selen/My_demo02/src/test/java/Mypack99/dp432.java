package Mypack99;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dp432 {
 
	@Parameters({"Browser", "OS"})
	@Test
//	@Parameters({"Browser", "OS"})
  public void f(String Browser, String OS) {
		System.out.println("hiiiiii");
		System.out.println(Browser);
		System.out.println(OS);
  }
}
