package com.osm.rough;

import com.osm.utilities.ExcelReader;

public class ExcelSheetOperation{
	
	public static ExcelReader exsh = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\JavaBooks.xlsx");

	public static void main(String[] args) {
		
		 
				
				String sheetName = "oTest";
			
				
				System.out.println(sheetName);
				int rows = exsh.getRowCount(sheetName);
				int cols = exsh.getColumnCount(sheetName);
				
				System.out.println(rows);
				System.out.println(cols);
		 
		
		
  
	}
	
	

}
