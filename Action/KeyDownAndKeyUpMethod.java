package Action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndKeyUpMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		List<WebElement> allElements = driver.findElements(By.cssSelector("a.nav-link"));
		Actions action = new Actions(driver);
		
		
		action.keyDown(Keys.CONTROL).perform();
		for(WebElement element:allElements) {
			element.click();
		}
		action.keyUp(Keys.CONTROL).perform();

	}

}
