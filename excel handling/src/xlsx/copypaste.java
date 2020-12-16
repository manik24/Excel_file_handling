package xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class copypaste 
{
	
	public static void main(String[]args) throws IOException
	{
        

		File f = new File("C:\\Users\\manik.kumar\\Downloads\\test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet = wb.getSheetAt(0);
		
		File f1 = new File("C:\\Users\\manik.kumar\\Downloads\\demo.xlsx");
		FileOutputStream fo = new FileOutputStream(f1);
		XSSFWorkbook ws = new XSSFWorkbook();
		XSSFSheet xs = ws.createSheet("new1");
		
		int rfc=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rfc;i++)
		{
			XSSFRow xrr=sheet.getRow(i);
			XSSFRow xwr=xs.createRow(i);
			
			int xrc=xrr.getPhysicalNumberOfCells();
			for(int j=0;j<xrc;j++)
			{
				XSSFCell xrj=xrr.getCell(j);
				String s=xrj.getStringCellValue();
				XSSFCell xrw=xwr.createCell(j);
				xrw.setCellValue(s);
				
			}
		}
		
		ws.write(fo);
		fo.flush();
		fo.close();
		wb.close();
		fis.close();
		
		
	}
	
	

	}

