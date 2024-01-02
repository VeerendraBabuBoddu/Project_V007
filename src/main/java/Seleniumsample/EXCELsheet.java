package Seleniumsample;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EXCELsheet {
    public static void main(String args[]) throws IOException {
        File src = new File("C:\\Users\\VEERENDRA\\Downloads\\Test Case 01 2.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sh=wb.getSheet("Sheet2");
        System.out.println(sh.getRow(3).getCell(3).getStringCellValue());
        System.out.println(sh.getRow(3).getCell(0).getStringCellValue());
        System.out.println(sh.getRow(48).getCell(7).getStringCellValue());
    }

}