package com.utils.dataFeeder;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;


public final class ReadExcel {
    private ReadExcel() {}

    public static Object[][] getTestData(String FILE_NAME, String SHEET_NAME) {
        Workbook book;
        Sheet sheet;
        String path = FILE_NAME + ".xlsx";
        try {
            FileInputStream file = new FileInputStream(path);
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sheet = book.getSheet(SHEET_NAME);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i+1).getCell(k).toString();
            }
        }
        //System.out.println(Arrays.deepToString(data));
        return data;
    }
}
