package Seleniumsample;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTOEXCELSHEET {
    public static void main(String args[]) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Data To Excel");

        Object [][]Exceldata={{"Veeru","Bat",100},{"Laddu","Bowl",5}};

        int rowcount=0;
        for(Object[] abook:Exceldata){
            Row row=sheet.createRow(rowcount++);

            int columncount=0;
            for(Object field:abook){
                Cell cell=row.createCell(columncount++);

                if(field instanceof String){
                    cell.setCellValue((String)field);
                }
                if(field instanceof Integer){
                    cell.setCellValue((Integer)field );
                }
            }
            FileOutputStream outputStream=new FileOutputStream("C:\\Users\\VEERENDRA\\Pictures\\Screenshots\\test1.xlsx");
            workbook.write(outputStream);
        }
    }
}
