package Ques_2;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;


public class workbook_sheetcreation {
	public static void main(String[] args) throws IOException {
		String workbookname="workbook1";
		try(HSSFWorkbook workbook1=new HSSFWorkbook()){
			HSSFSheet sheet1=workbook1.createSheet("Sheet1");
			System.out.println("Workbook1 created successfully..... and the workbook name is :: "+workbookname);
			System.out.println("Excel sheet has been created and the sheet name is :: "+sheet1.getSheetName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
