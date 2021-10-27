package shdtestpeopleinteractive;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;

public class Excel_Util {
	
	@DataProvider(name="testdata")
	public static Object[][] readexcelretobj() throws Exception {
		
FileInputStream f= new FileInputStream("F:\\Eclipse Java new Programs\\shdtestpeopleinteractive\\src\\test\\resources\\Test_data.xls");
		
HSSFWorkbook workbook = new HSSFWorkbook(f);
HSSFSheet s = workbook.getSheetAt(0);
HSSFRow row = s.getRow(0);
int rownum=s.getPhysicalNumberOfRows();
int colnum= s.getLastRowNum();
//System.out.println(rownum);
//System.out.println(colnum);
Object data[][] = new Object[rownum][colnum];
List<Object> l = new ArrayList<Object>();
for(int i=0;i<rownum-1;i++) {
	row = s.getRow(i+1);
	for(int j=0;j<colnum;j++) {
		HSSFCell c  = row.getCell(j);
		//l.add(c.getStringCellValue());
		data[i][j]=c.getStringCellValue();
	}
}

return data;
		}
	
	public static List<String> readexcelretlist() throws Exception {
		
		FileInputStream f= new FileInputStream("F:\\Eclipse Java new Programs\\shdtestpeopleinteractive\\src\\test\\resources\\Test_data.xls");
				
		HSSFWorkbook workbook = new HSSFWorkbook(f);
		HSSFSheet s = workbook.getSheetAt(0);
		HSSFRow row = s.getRow(0);
		int rownum=s.getPhysicalNumberOfRows();
		int colnum= s.getLastRowNum();
		//System.out.println(rownum);
		//System.out.println(colnum);
		List data = new ArrayList<String>();
		List<Object> l = new ArrayList<Object>();
		for(int i=0;i<rownum-1;i++) {
			row = s.getRow(i+1);
			for(int j=0;j<colnum;j++) {
				HSSFCell c  = row.getCell(j);
				//l.add(c.getStringCellValue());
				data.add(c.getStringCellValue());
			}
		}

		return data;
				}

	
//	public static void main(String args[]) {
//		try {
//		Object data1[][]  = readexcel();
//		//for(int i=0;i<data1.length;i++) {
//			//for(int j=0;j<=i;j++) {
//		System.out.println(data1[0][0]);
//		System.out.println(data1[0][1]);
//		
//		System.out.println(data1[1][0]);
//		System.out.println(data1[1][1]);
//			//}
//		//}
//		}catch(Exception e) {};
//	}
}
