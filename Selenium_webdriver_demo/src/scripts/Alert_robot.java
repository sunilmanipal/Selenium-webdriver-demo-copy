package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_robot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new FirefoxDriver();
		dr.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		Thread.sleep(3000);
		Alert alert = dr.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		dr.findElement(By.xpath("//*[@id='content']/p[8]/button")).click();
		alert = dr.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("The text displayed in the alert dialog is:"+alertText);
		Thread.sleep(3000);
		alert.dismiss();
		dr.findElement(By.xpath("//*[@id='content']/p[11]/button")).click();
		alert = dr.switchTo().alert();
		alert.sendKeys("yes");
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();
		//dr.close();
		dr.quit();

	}

}
