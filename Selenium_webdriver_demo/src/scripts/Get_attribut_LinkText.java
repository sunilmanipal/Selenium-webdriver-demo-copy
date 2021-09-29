package scripts;

// This program is to get value using get attributs and Printing the same and click on a link using Linktext

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_attribut_LinkText {

	public static void main(String[] args) {
		try
		{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		String pro = driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("id");
		System.out.println(pro);
		
		driver.findElement(By.xpath("//*[@id='"+pro+"']")).sendKeys("admin");
		String tagname = driver.findElement(By.xpath("//*[@id='txtUsername']")).getAttribute("value");
		System.out.println(tagname);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(tagname);
		String tagname1 = driver.findElement(By.xpath("//*[@id='btnLogin']")).getAttribute("type");
		System.out.println(tagname1);
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(30000);
		driver.findElement(By.linkText("Performance")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
