package txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class rownum 
{
	
	public  void rowdata(int rnum) throws IOException
	{
		File f= new File("C:\\Users\\manik.kumar\\Desktop\\test1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
	String a;
	int b=0;
		
	while((a=br.readLine())!=null)			
		{
			b=b+1;
					if(b==rnum)
					{
						System.out.println(a); //explicit conversion integer to character
				    }
			
	    }

	}
	
	public static void main(String[]args) throws IOException
	{
		rownum r = new rownum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row number to read the data");
		int num=s.nextInt();
		r.rowdata(num);
	}
}
