package Seleniumsample;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EXCELsheet1 {
    public static void main(String args[]) throws IOException {
        File source=new File("C:\\Users\\VEERENDRA\\Downloads\\Untitled spreadsheet.xlsx");
        FileInputStream FIS=new FileInputStream(source);

        XSSFWorkbook wb=new XSSFWorkbook(FIS);
        XSSFSheet Sh=wb.getSheet("Sheet1");

        System.out.println(Sh.getRow(0).getCell(0).getStringCellValue());
        System.out.println(Sh.getRow(0).getCell(2).getStringCellValue());
        System.out.println(Sh.getRow(0).getCell(4).getStringCellValue());
        System.out.println(Sh.getRow(0).getCell(6).getStringCellValue());
        System.out.println(Sh.getRow(0).getCell(8).getStringCellValue());
    }
}
