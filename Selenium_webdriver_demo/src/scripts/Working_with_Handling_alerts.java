package scripts;

// This program is used to handling alerts

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_with_Handling_alerts {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value='Go!']")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();

	}

}
