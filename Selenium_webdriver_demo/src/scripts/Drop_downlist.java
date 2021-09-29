package scripts;

// This program is used to work with dropdown list

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_downlist {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://enterprise.demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("linda.anderson");
		driver.findElement(By.id("txtPassword")).sendKeys("linda.anderson");
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(30000);
		driver.findElement(By.linkText("Performance")).click();

		WebElement wb4 = driver.findElement(By.id("appraisalSearch_appraisal_cycle"));
		Select sel = new Select(wb4);
		//get the content of weblist using getoption		
		List <WebElement> lst = sel.getOptions();
		//display the weblist count
		System.out.println(lst.size());
		String expectedval = "Q1 Review";
		boolean flag =false;
				
		//to display all the content of web list
		for (int i=0;i<lst.size();i++)
		{
			String actualval= (lst.get(i).getText());
			if (expectedval.equals(actualval))
		   {
			sel.selectByVisibleText(expectedval);
			flag=true;
			break;				
		   }					
		}			

		if (flag)
		{
			System.out.println("Expected Value is present");
		}
		else
		{
			System.out.println("Expected value is not present");
		}

	}

}
