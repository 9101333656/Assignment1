package Action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardSimulationAction {

public static void main(String [] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameElement = driver.findElement(By.cssSelector("input#username"));
		WebElement passwordElement = driver.findElement(By.cssSelector("input.textField.pwdfield"));
		
		Actions action = new Actions(driver);
		action.sendKeys(usernameElement,"admin").perform();
		action.sendKeys(passwordElement,"manager").perform();
		action.sendKeys(passwordElement,Keys.ENTER).perform();
}
}
