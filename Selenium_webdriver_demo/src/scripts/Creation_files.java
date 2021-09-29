package scripts;

// This program is all about creating new file and overriding the file

import java.io.File;
import java.io.IOException;

public class Creation_files {

	public static void main(String[] args) {
		try {
		File f;
		f=new File("D:\\newtxt1.txt");
			if(!f.exists())
			{
			
				f.createNewFile();
			} 
		}
			catch (IOException e) {
				e.printStackTrace();
			}
			}

	}


