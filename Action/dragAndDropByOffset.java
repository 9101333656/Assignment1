package Action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropByOffset {

public static void main(String [] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement element = driver.findElement(By.cssSelector("div#draggable"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 50, 30).perform();
		Thread.sleep(2000);
		action.dragAndDropBy(element, 10, -25).perform();
}
}
