package scripts;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParameterisationUsingExcel {

	public static void main(String[] args) throws BiffException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\sunilna\\Documents\\test1.xls"));
		Sheet sheet = null;
		int noOfSheets = workbook.getNumberOfSheets();
		Cell cell2 = null;
		
		for(int p=0; p<noOfSheets; p++){
			sheet = workbook.getSheet(p);
			int noOfRows = sheet.getRows();
			int noOfColumns = sheet.getColumns();
			for(int i = 0; i<noOfRows; i++)
				for(int j = 0; j<noOfColumns; j++){
					cell2 = sheet.getCell(j, i);
					if(cell2.getContents().length()>0)
						
						System.out.println(cell2.getContents()); 
				}
		}
			
			
		
		
		
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();

	}

}
