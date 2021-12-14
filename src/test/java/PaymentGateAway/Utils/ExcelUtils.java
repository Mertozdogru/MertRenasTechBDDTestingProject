package PaymentGateAway.Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {
    public String getCell(int sheetIndex,int row, int cell) throws Exception {
        String filePath="/Users/ummert/Desktop/MertRenasTechBDDTestingProject/Excel/data.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet=xssfWorkbook.getSheetAt(sheetIndex);
        return String.valueOf(xssfSheet.getRow(row).getCell(cell));
    }

}
