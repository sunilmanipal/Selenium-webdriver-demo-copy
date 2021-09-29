package scripts;

// This program is used to work with checkbox and radio button and selecting multiple elements



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Multiple_Select_Checkbox_Radiobutton {

	public static void main(String[] args) {
		//To open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Upskill Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To naviagte to the URL
		driver.navigate().to("http://newtours.demoaut.com/");
		// To maximize the browser
		driver.manage().window().maximize();
		//To enter username, password and click on login button
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		// To select the radio button
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		// To select the value in the Drop down
		WebElement DD = driver.findElement(By.name("passCount"));
		Select sel = new Select(DD);
		sel.selectByVisibleText("2");
		// To click on continue
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		// To add the value
		driver.findElement(By.name("passFirst0")).sendKeys("sunil");
		driver.findElement(By.name("passLast0")).sendKeys("nagaraj");
		driver.findElement(By.name("passFirst1")).sendKeys("sunil");
		driver.findElement(By.name("passLast1")).sendKeys("nagaraj");
		driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234 1234");
//		List<WebElement> checkboxlist = driver.findElements(By.xpath("//*[@name='ticketLess' and @value='checkbox']"));
		// To select multiple checkbox
		List<WebElement> checkboxlist = driver.findElements(By.name("ticketLess"));
		for(WebElement e:checkboxlist){
			e.click();
		}
		
		
	}

}

