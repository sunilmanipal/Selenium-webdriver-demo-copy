package scripts;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_readandwrite {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		File fexcel = new File("C:\\Users\\sunilna\\Documents\\test1.xls");
		WritableWorkbook writebook = Workbook.createWorkbook(fexcel);
		writebook.createSheet("sunil", 0);
		WritableSheet writesheet = writebook.getSheet(0);
		Label data1 = new Label(0,0,"sunil");
		writesheet.addCell(data1);

		Label data2 = new Label(0,1,"test");
		writesheet.addCell(data2);
		writebook.createSheet("kg", 1);

		WritableSheet writesheet1 = writebook.getSheet(1);
		Label data3 = new Label(0,5,"sun");
		writesheet1.addCell(data3);
		writebook.write();
		writebook.close();


		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\sunilna\\Documents\\test1.xls"));
		//Sheet sheet = workbook.getSheet(0);
		Sheet sheet = null;
		int noOfSheets = workbook.getNumberOfSheets();
		Cell cell2 = null;


		for(int p=0; p<noOfSheets; p++){
			sheet = workbook.getSheet(p);
			int noOfRows = sheet.getRows();
			int noOfColumns = sheet.getColumns();
			System.out.println(sheet.getRows() + "\t" + sheet.getColumns());
			System.out.println("Data from Sheet " + p);
			for(int i = 0; i<noOfRows; i++)
				for(int j = 0; j<noOfColumns; j++){
					cell2 = sheet.getCell(j, i);
					if(cell2.getContents().length()>0)
						System.out.println(cell2.getContents()); 
				}
		}

		/* Cell cell1 = sheet.getCell(0, 0);
	      System.out.println(cell1.getContents());
	      Cell cell2 = sheet.getCell(0, 1);
	      System.out.println(cell2.getContents());*/
		workbook.close();



	}

}
