package SDET_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class file_upload {
	WebDriver driver;
	@BeforeTest
	public void BT() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(4000);
	}
@Test
public void TC_1() throws InterruptedException {
	Thread.sleep(4000);
	WebElement browse=driver.findElement(By.name("input4[]"));
	//browse.click();
	String file_path="C:\\spring-tool-suite-4-4.22.1.RELEASE-e4.31.0-win32.win32.x86_64.self-extracting(1)(1)\\SDET_assignment_5\\instagram.xlsx";
	browse.sendKeys(file_path);
	Thread.sleep(5000);
}
}