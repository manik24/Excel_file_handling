package txtfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copypaste {
	
	public static void main(String[]args) throws IOException
	{
		File txt1 = new File("C:\\Users\\manik.kumar\\Desktop\\test.txt");
		File txt2 = new File("C:\\Users\\manik.kumar\\Desktop\\test1.txt");
		FileReader f1 = new FileReader(txt1);
		FileWriter w1 = new FileWriter(txt2,false);
		
		BufferedReader br = new BufferedReader(f1);
		BufferedWriter bw = new BufferedWriter(w1);
		
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
	 bw.close();
	}

}
