package scripts;

// Uploading a file in to application

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploading_File {

	public static void main(String[] args) {
		String baseUrl = "http://www.megafileupload.com/";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id='revslider-194']/ul/li/div[4]/a/i"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("file:///C:/Users/sunilna/Desktop/example for tr2 and td2.html");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		}
	}


