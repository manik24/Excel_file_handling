package txtfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writerow {
	public void writedata(int rcount) throws IOException
	{
		File f= new File("C:\\Users\\manik.kumar\\Desktop\\test.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fr);

	  for(int i=1;i<=rcount;i++)
		{
			System.out.println("Enter the line");
			Scanner s= new Scanner(System.in);
			String data=s.next();	
			br.write(data);
			br.newLine();
		}
		br.close();
		
    }
	public static void main(String[]args) throws IOException
	{
		writerow r = new writerow();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row till where you want to write the data");
		int rowcount=s.nextInt();
		r.writedata(rowcount);
	}
	
}
