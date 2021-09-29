package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Selenium_grid{

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cp = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.56.1:4444/wd/hub"),cp);
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.close();	
	}

}
