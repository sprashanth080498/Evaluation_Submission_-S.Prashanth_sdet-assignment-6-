package SDET_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class instagram {
    WebDriver driver;
    String val_1, val_2;

    @BeforeTest
    public void bt() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 0)
    public void tc_1() throws IOException {
        File excel = new File("C:/spring-tool-suite-4-4.22.1.RELEASE-e4.31.0-win32.win32.x86_64.self-extracting(1)(1)/SDET_assignment_5/instagram.xlsx");//("C:/Users/ADMIN/Desktop/instagram.xlsx");
        FileInputStream fis = new FileInputStream(excel); // to read the excel file
        XSSFWorkbook wb = new XSSFWorkbook(fis); // to read the workbook
        XSSFSheet sht = wb.getSheet("Sheet1"); // to read from the sheet

        int row_count = sht.getLastRowNum(); // fetch the data till the last row of the sheet
        System.out.println(row_count);
        for (int i = 0; i <= row_count; i++) { // loop through rows, including the last one
            val_1 = sht.getRow(i).getCell(0).getStringCellValue();
            val_2 = sht.getRow(i).getCell(1).getStringCellValue();
            System.out.println("Username: " + val_1);
            System.out.println("Password: " + val_2);
                driver.findElement(By.name("username")).sendKeys(val_1);
                driver.findElement(By.name("password")).sendKeys(val_2);
                driver.findElement(By.cssSelector("button[type='submit']")).click();
        }
        // Close the workbook and file input stream
        wb.close();
        fis.close();
    }
}