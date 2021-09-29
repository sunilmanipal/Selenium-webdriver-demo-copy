package scripts;

// This program is to use webdriver methods like is enabled is displayed 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elements_methods_like_displayed {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement enb=driver.findElement(By.name("userName"));
		if(enb.isEnabled())
		{
			enb.sendKeys("sunil");
			enb.clear();
			enb.sendKeys("sunil");
		}
		if (driver.findElement(By.name("userName")).isDisplayed())
		{
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		}
		if (driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@value='oneway']")).click();
		}
	}
		

}
