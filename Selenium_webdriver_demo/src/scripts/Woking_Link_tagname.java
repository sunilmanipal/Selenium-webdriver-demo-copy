package scripts;

// This program is to identify all the link and print all the names of the link using tagname

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Woking_Link_tagname {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "http://newtours.demoaut.com/";
        WebDriver driver = new FirefoxDriver();
        //String title=driver.getTitle();
        //System.out.println(title);
        String underConsTitle = "Under Construction: Mercury Tours";
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println( "\"" + t + "\""
                        + "\" is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + "\" is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }

	}


