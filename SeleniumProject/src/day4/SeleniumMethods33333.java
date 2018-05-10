package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SeleniumMethods33333 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());

//		System.out.println(driver.getPageSource());
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().to("http://seleniumhq.org");
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(3);
		driver.navigate().refresh();
	}

}
