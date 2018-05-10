package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
//		driver.manage().deleteAllCookies();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Watch out Sale']")));
		
		driver.findElement(By.xpath("//img[@alt='Watch out Sale']")).click();

	}

}
