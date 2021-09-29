package scripts;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cp = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(new URL
				("http://172.24.85.33:4444/wd/hub"),cp);
		driver.navigate().to("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		driver.close();
	}

}
