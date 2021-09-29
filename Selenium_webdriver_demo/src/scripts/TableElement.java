package scripts;

// This program is used to identify the table element and get text of the element

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableElement {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file://C://Users//sunilna//Desktop//table.html");
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		driver.close();

	}

}
