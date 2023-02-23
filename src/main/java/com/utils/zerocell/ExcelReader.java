package com.utils.zerocell;

import com.creditdatamw.zerocell.Reader;
import java.io.File;
import java.util.List;

public class ExcelReader {
    private ExcelReader(){}

   // private static List<TestData_Status> testDatas = null;

   public static List<TestData_Status> readDAta(){
        return Reader.of(TestData_Status.class)
                .from(new File("td_status.xlsx"))
                .sheet("sheet1")
                .skipHeaderRow(true)
                .list();
    }

//    public static List<TestData_Status> getTestDatas() {
//        return testDatas;
//    }
}
