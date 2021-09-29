package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		driver.switchTo().frame("iframe1");
		driver.findElement(By.name("firstname")).sendKeys("jaya");
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		driver.switchTo().frame("iframe2");
		driver.findElement(By.xpath("//*[@id='ui-id-2']")).click();
		

	}

}
