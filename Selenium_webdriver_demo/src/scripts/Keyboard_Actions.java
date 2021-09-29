package scripts;

// This program is used to work with the keyboard actions
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
				
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");	
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("linda.anderson");
				
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
	}

}
