package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class demo_first_program {
	 WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("linda.anderson");
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://enterprise-demo.orangehrmlive.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
