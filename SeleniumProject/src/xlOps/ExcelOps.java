package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgHRMLibrary;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException 
	{
		OrgHRMLibrary om=new OrgHRMLibrary();
		String xlpath="F:\\SidhardhRecordings\\Workspace\\SeleniumProject\\src\\testdata\\EmpRegData.xlsx";
		String xlout="F:\\SidhardhRecordings\\Workspace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(1);
		
//		System.out.println(c.getStringCellValue());
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		om.OrgLogin("Admin", "admin");
		
		for (int i = 1; i <= Rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String Eid=c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+Eid);
			
			String res=om.OrgEmpReg(f, l, Eid);
			
			c3.setCellValue(res);
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.OrgLogout();
		om.OrgClose();
	}

}
