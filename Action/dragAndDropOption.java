package Action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropOption {

	
public static void main(String [] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame.lazyloaded")));
		WebElement source1Element = driver.findElement(By.cssSelector("img[alt='The chalet at the Green mountain lake']"));
		WebElement destElement = driver.findElement(By.id("trash"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source1Element, destElement).perform();
}
}