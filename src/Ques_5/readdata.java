package Ques_5;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class readdata {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String workbookname="workbook1";
		try(HSSFWorkbook workbook1=new HSSFWorkbook()){
			HSSFSheet sheet1=workbook1.createSheet("Sheet1");
			System.out.println("Workbook1 created successfully..... and the workbook name is :: "+workbookname);
			System.out.println("Excel sheet has been created and the sheet name is :: "+sheet1.getSheetName());
			Object[][] data1= {
					{"Name","Age","E-mail"},
					{"John Doe",30,"john@test.com"},
					{"Jane Doe",28,"john@test.com"},
					{"Bob Smith",35,"jacky@example.com"},
					{"Swapnil",37,"Swapnil@example.com"}
			};
//			System.out.println("Entered data1 values :: ");
//			for(Object[] datas:data1) {
//				for(Object oridata:datas) {
//					System.out.print(oridata+" ");
//				}
//				System.out.println();
//			}
			int rowsize=0;
			for(Object[] rowread:data1) {
				Row rowwrite1=sheet1.createRow(rowsize++);
				int columnsize=0;
				for(Object columnvalue:rowread) {
					Cell Cellwrite1=rowwrite1.createCell(columnsize++);
					if(columnvalue instanceof String) {
						Cellwrite1.setCellValue((String)columnvalue);	
					}else if(columnvalue instanceof Integer){
						Cellwrite1.setCellValue((Integer)columnvalue);
					}
				}
			}
			try {
				FileOutputStream file1=new FileOutputStream("Data.xlsx");
				workbook1.write(file1);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}


}
