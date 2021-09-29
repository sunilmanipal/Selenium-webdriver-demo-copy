package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Janki_Table_Edunxt {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sunilna/Desktop/janki.html");
		String text = driver.findElement(By.xpath("//body/ol/li[2]")).getText();
		System.out.println(text);
		driver.close();

	}

}
