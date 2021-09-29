package scripts;

//This program is used to work with handling frames

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frmaes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("linda.anderson");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		List<WebElement> iframeElements = driver.findElements(By.tagName("fieldset"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		System.out.println(iframeElements);
		
		//driver.findElement(By.linkText("More")).click();
		driver.switchTo().frame("fieldset");
		driver.findElement(By.linkText("Apply Leave")).click();

	}

}
