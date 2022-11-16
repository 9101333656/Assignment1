package Action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformClickAndHoldAndReleseMethod {

public static void main(String [] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
		Actions action = new Actions(driver);
		//action.contextClick(driver.findElement(By.cssSelector("div#item"))).perform();
		action.clickAndHold(driver.findElement(By.cssSelector("div#item"))).perform();
		action.release().perform();
}
}
