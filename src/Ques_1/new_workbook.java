package Ques_1;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Workbook;

public class new_workbook {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//HSSFWorkbook workbook1=new HSSFWorkbook();
		String workbookname="workbook1";
		try(HSSFWorkbook workbook1=new HSSFWorkbook()){
			System.out.println("Workbook1 created successfully..... and the workbook name is :: "+workbookname);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
