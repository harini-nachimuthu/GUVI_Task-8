package Ques_3;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class datatosheet {
		public static void main(String[] args){
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
				System.out.println("Entered data1 values :: ");
				for(Object[] datas:data1) {
					for(Object oridata:datas) {
						System.out.print(oridata+" ");
					}
					System.out.println();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
		}

}
