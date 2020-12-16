	package xlsx;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	import org.apache.commons.collections4.Get;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class rowrange {
		
		public void readdatarowrange(int rowi,int rowf) throws Exception
		{
			File f = new File("C:\\Users\\manik.kumar\\Downloads\\test.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook  wb = new XSSFWorkbook(fis);
			XSSFSheet  sheet = wb.getSheetAt(0);
			 int rowcount=sheet.getPhysicalNumberOfRows();
			 int n=1;
			for(int i=1;i<=rowcount;i++)
		{
			XSSFRow r=sheet.getRow(i);		
			int celcount=r.getPhysicalNumberOfCells();
			for(int j=0;j<celcount;j++)
			{
				XSSFCell val= r.getCell(j);
				
				System.out.print("record : "+n+""+"|"+val+"|");
				
			}
			System.out.println();
			
			n++;
		}
			
			wb.close();
			fis.close();
	}			
			public static void main(String[]args) throws Exception
			{
				rowrange r = new rowrange();
		       Scanner s = new Scanner(System.in);
		       System.out.println("Enter the start row numnber to pick the data");
		       int r1 = s.nextInt();
		       System.out.println("Enter the last row numnber to pick the data");
		       int r2 = s.nextInt();
			   r.readdatarowrange(r1,r2);
			}
			
	
	}



