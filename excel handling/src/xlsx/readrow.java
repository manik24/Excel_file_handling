package xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readrow {

	public void readdataofparticularrow(int row) throws Exception
	{
		File f = new File("C:\\Users\\manik.kumar\\Downloads\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet = wb.getSheetAt(0);
		XSSFRow r = sheet.getRow(row);

		int celcount=r.getPhysicalNumberOfCells();
		for(int i=0;i<celcount;i++)
		{
			XSSFCell val= r.getCell(i);
			System.out.print("||"+val+"||");

		}
	}			
	public static void main(String[]args) throws Exception
	{
		readrow r = new readrow();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row numnber to pick the data");
		int r1 = s.nextInt();
		r.readdataofparticularrow(r1);
	}

}
