package framework_test.dataprovider_test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadX {
    public Object[][] readExcel() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/framework_test/dataprovider_test/credentials.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("login");
        int numRows = sheet.getLastRowNum() - 1; // без першого рядка
        int numColums = sheet.getRow(0).getPhysicalNumberOfCells();

        Object obj[][] = new Object[numRows][numColums];
        for (int i = 0; i < numRows; i++) {
            obj[i][0] = sheet.getRow(i + 1).getCell(0).toString();
            obj[i][1] = sheet.getRow(i + 1).getCell(1).toString();
        }

        return obj;
    }

}

