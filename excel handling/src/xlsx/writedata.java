package xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata

{
	static Scanner s = new Scanner(System.in);
	
	public void writefile(int rc,int cc) throws IOException
	{
	File f = new File("C:\\Users\\manik.kumar\\Downloads\\test.xlsx");
	FileOutputStream fo = new FileOutputStream(f);
	XSSFWorkbook ws = new XSSFWorkbook();
	XSSFSheet xs = ws.createSheet("new1");
	for(int i=0;i<=rc;i++)
	{
		XSSFRow xr= xs.createRow(i);
		
		for(int j=0;j<=cc;j++)
		{
			XSSFCell xc= xr.createCell(j);
			
			System.out.println("Please enter the data to be entered in Row:"+i+" &  Column:"+j+"");
			
			String data=s.next();
			xc.setCellValue(data);
		}
	}
	ws.write(fo);
	fo.flush();
	ws.close();
	fo.close();
 }
	
	public static void main(String[]args) throws IOException
	{
		writedata d= new writedata();
	       System.out.println("Enter the number of row to insert the data");
	       int r1 = s.nextInt();
	       System.out.println("Enter the number of columns to insert the data");
	       int c1 = s.nextInt();
	       d.writefile(r1, c1);
	}
	

}

