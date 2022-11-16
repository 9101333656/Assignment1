package Action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverindAndClick {

public static void main(String [] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("BEAUTY"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
}
}
