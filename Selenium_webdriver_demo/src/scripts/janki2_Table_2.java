package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class janki2_Table_2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sunilna/Desktop/janki2.html");
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
		System.out.println(text);
		driver.close();

	}

}
