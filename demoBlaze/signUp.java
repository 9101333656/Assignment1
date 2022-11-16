package demoBlaze;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signUp {

	public static void main(String [] args) throws InterruptedException, AWTException {


	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector("a#signin2")).click();
		driver.findElement(By.cssSelector("input#sign-username")).sendKeys("ridip");
		driver.findElement(By.cssSelector("input#sign-password")).sendKeys("rj@123");
		driver.findElement(By.cssSelector("button[onclick='register()']")).click();
		//driver.switchTo().alert().accept();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Close'])[2]")));
		 driver.findElement(By.xpath("(//button[text()='Close'])[2]")).click();
		 driver.quit();
}
}