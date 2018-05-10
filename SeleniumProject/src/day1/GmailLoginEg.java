package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args) 
	{
		//Launching the Firefox
		WebDriver driver=new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		//Navigating to url
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("testingtoolstrainer449");
//		Sleeper.sleepTightInSeconds(5);
//		email.clear();
		
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
