package txtfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writerange {
	
	public void writerangedata(int initial,int end) throws IOException
	{
		File f= new File("C:\\Users\\manik.kumar\\Desktop\\test1.txt");
		FileWriter fr = new FileWriter(f,true);
		BufferedWriter br = new BufferedWriter(fr);
		 for(int i=initial;i<=end;i++)
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
		writerange r = new writerange();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start row number to read the data");
		int start=s.nextInt();
		System.out.println("Enter the last row number to read the data");
		int last=s.nextInt();
		r.writerangedata(start,last);
	}

}
