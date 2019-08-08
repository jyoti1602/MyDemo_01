package Mypack99;

import org.testng.annotations.Test;

public class Demo_ng {
  @Test(priority=1)
  public void login() {
	  System.out.println("Code for login");
	    
  }
  @Test
  public void logout() {
	  System.out.println("Code for logout");
  }
  @Test
  public void register() {
	  System.out.println("Code for register");	  
  }
}
