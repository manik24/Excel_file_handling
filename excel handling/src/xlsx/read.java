package xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read 
{

	private static Scanner s;

	public  void readdataofrowandcolumn(int row,int col) throws Exception
	{
		File f = new File("C:\\Users\\manik.kumar\\Downloads\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet = wb.getSheetAt(0);
		/* for getting single cell value */
		
		String val =   sheet.getRow(row).getCell(col).getStringCellValue();
		 System.out.println(val);
		
		
		
	}
	
	public static void main(String[]args) throws Exception
	{
       read r = new read();
       s = new Scanner(System.in);
       System.out.println("Enter the row numnber to pick the data");
       int r1 = s.nextInt();
       System.out.println("Enter the Column numnber to pick the data");
       int c1 = s.nextInt();
	   r.readdataofrowandcolumn(r1, c1);
	}
}
