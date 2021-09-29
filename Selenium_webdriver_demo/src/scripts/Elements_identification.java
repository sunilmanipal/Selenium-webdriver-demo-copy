package scripts;

//This program is for Element identification passing a value and compare  the result

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Elements_identification {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://enterprise.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("linda.anderson");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("linda.anderson");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String expectedtitle = "OrangeHRM";
		System.out.println(expectedtitle);
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if (expectedtitle.equals(actualtitle))
		{
			
			System.out.println("the title are same logout");
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			driver.close();
			//driver.quit();
		}
		else
		{
			System.out.println("the title is not same");
			driver.close();
			//driver.quit();
		}
		driver.quit();
		
		
		}

	}


