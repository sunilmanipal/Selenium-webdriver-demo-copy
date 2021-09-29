package scripts;

// This program fetch the current date and store it in external file txt using log

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class working_logs {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		 SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd hh-mm-ss"); 
		 String strTime=df.format(new Date(time));
		
		String logPath="D:\\log.txt";
		
		try {
           BufferedWriter bw = new BufferedWriter(new FileWriter(new File(logPath), true));
		bw.write("["+strTime+"]: ");
           bw.newLine();
           bw.close();
	}
	catch(Exception e)
		{
		System.out.println(e);	
		}
	}
}
