package scripts;

// This program is used to identify the number of links and to diaplay all the links
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifing_numberoflinks_tags {

	public static void main(String[] args) {


WebDriver driver = new FirefoxDriver();
driver.get("http://enterprise.demo.orangehrmlive.com/");

driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("linda.anderson");
driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
driver.findElement(By.id("btnLogin")).click();

List<WebElement> lst = driver.findElements(By.tagName("a"));
System.out.println(lst.size());
		
for(int i=0;i<lst.size();i++)
	{
	System.out.println(lst.get(i).getText());
	}

	}

}
