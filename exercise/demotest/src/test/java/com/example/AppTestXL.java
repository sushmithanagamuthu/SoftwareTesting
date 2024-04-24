// package com.example;

// import java.io.FileInputStream;
// import org.openqa.selenium.WebDriver;
// import org.apache.poi.xssf.usermodel.XSSFRow;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// import org.openqa.selenium.By;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class AppTestXL {
// WebDriver driver;
// @BeforeMethod
// public void Testsetup() throws Exception{
// WebDriverManager.chromedriver().setup();
// driver =new ChromeDriver();
// driver.manage().window().maximize();
// driver.get("http://dbankdemo.com/bank/login");
// }
// @Test
// public void Test() throws Exception{
// FileInputStream fs=new
// FileInputStream("C:\\Users\\quinn\\OneDrive\\Desktop\\dbank.xlsx");
// XSSFWorkbook workbook=new XSSFWorkbook(fs);
// XSSFSheet sheet1=workbook.getSheet("Sheet1");
// XSSFRow row1=sheet1.getRow(1);
// String username=row1.getCell(0).getStringCellValue();
// String password=row1.getCell(1).getStringCellValue();
// Thread.sleep(6000);
// driver.findElement(By.id("username")).sendKeys(username);
// driver.findElement(By.id("password")).sendKeys(password);
// // driver.findElement(By.id("submit")).click();
// System.out.println(username+ " " +password);
// Thread.sleep(6000);
// }
// @AfterMethod
// public void Testquit(){
// driver.quit();
// }
// }
// // @Test
// // public void Test() throws Exception {
// // FileInputStream fs = new FileInputStream("D:\\dbankdemo.xlsx");
// // // D:\\_Temp_2\\filename.xlsx
// // XSSFWorkbook workbook = new XSSFWorkbook(fs);
// // XSSFSheet sheet1 = workbook.getSheet("login");
// // XSSFRow row1 = sheet1.getRow(1);
// // String username = row1.getCell(0).getStringCellValue();
// // String password = row1.getCell(1).getStringCellValue();
// // Thread.sleep(3000);
// // driver.findElement(By.id("username")).sendKeys(username);
// // driver.findElement(By.id("password")).sendKeys(password);
// // driver.findElement(By.id("submit")).click();
// // System.out.println(username + " " + password);
// // Thread.sleep(3000);
// // }
