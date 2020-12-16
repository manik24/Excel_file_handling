package txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class class1 {

	public static void main(String[]args) throws IOException
	{
		File f= new File("C:\\Users\\manik.kumar\\Desktop\\test.txt");
		FileReader fr = new FileReader(f);
		String s;
		int a;
		BufferedReader br = new BufferedReader(fr);
		while((s=br.readLine()) != null)
				{
			       System.out.println(s);
				}
		
	}

	}

