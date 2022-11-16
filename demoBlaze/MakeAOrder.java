package demoBlaze;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeAOrder {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.cssSelector("[id='itemc']:nth-child(2)")).click();
		driver.findElement(By.cssSelector("a.hrefch[href='prod.html?idp_=5'")).click();
		driver.findElement(By.cssSelector("a.btn.btn-success.btn-lg")).click();
		 Robot rbt=new Robot();
    	 Thread.sleep(1000);
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("[id='cartur']")).click();
		 driver.findElement(By.cssSelector(".btn.btn-success")).click();
		 driver.findElement(By.cssSelector("input.form-control#name")).sendKeys("ridip");
		 driver.findElement(By.cssSelector("input.form-control#country")).sendKeys("India");
		 driver.findElement(By.cssSelector("input.form-control#city")).sendKeys("Delhi");
		 driver.findElement(By.cssSelector("input.form-control#card")).sendKeys("123456789101");
		 driver.findElement(By.cssSelector("input.form-control#month")).sendKeys("November");
		 driver.findElement(By.cssSelector("input.form-control#year")).sendKeys("2022");
		 driver.findElement(By.cssSelector("button.btn.btn-primary[onclick='purchaseOrder()']")).click();
		// driver.findElement(By.cssSelector("button.confirm.btn.btn-lg.btn-primary")).click();
		
		

	}

}
