package SDET_assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_and_drop {
	WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@Test
public void tc1() {
	WebElement drag=driver.findElement(By.cssSelector("#draggable"));
	WebElement drop1=driver.findElement(By.cssSelector("#droppable"));
	WebElement drop2=driver.findElement(By.cssSelector("#dropzone2"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop1).build().perform();
	act.dragAndDrop(drop1, drop2).build().perform();
	}
}
