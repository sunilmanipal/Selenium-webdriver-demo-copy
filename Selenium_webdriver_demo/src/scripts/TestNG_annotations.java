package scripts;

// This program to work with TestNG

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG_annotations {
	WebDriver driver;
  @Test
  public void f() {
	  String a = driver.getTitle();
	  System.out.println(a.trim());
	  System.out.println(a);
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  Assert.assertEquals(driver.findElement(By.id("txtUsername")).getAttribute("value"), "linda.anderson", "Check the name data");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }
  

}
