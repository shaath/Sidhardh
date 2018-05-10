package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_KeyboardOpsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		Sleeper.sleepTightInSeconds(3);
		//Focusing on gmail
		act.moveToElement(gmail).build().perform();
		Sleeper.sleepTightInSeconds(3);
		//Right click
		act.contextClick().build().perform();
		Sleeper.sleepTightInSeconds(3);
		//click on downarrow key 3 times
//		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Sleeper.sleepTightInSeconds(3);
//		//Clicking on Enter
//		act.sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.chord("P")).build().perform();
		

	}

}
