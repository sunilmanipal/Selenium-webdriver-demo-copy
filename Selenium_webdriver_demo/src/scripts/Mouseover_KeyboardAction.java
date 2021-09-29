package scripts;

// This program is to work with mouseover and performing keyboard actions

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Mouseover_KeyboardAction {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement link_Home= driver.findElement(By.linkText("Car Rentals"));
		
		Actions builder = new Actions(driver);
		Action mouseoverhome = builder.moveToElement(link_Home).build();
		mouseoverhome.perform();
		builder.sendKeys(link_Home,(Keys.ENTER)).perform();
		
	}

}
