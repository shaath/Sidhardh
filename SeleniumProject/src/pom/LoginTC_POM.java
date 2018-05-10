package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;

public class LoginTC_POM {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		lp.login(lp.u, lp.p);
		
		AdminMenuPage ap=PageFactory.initElements(driver, AdminMenuPage.class);
		
		Sleeper.sleepTightInSeconds(3);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		

	}

}
