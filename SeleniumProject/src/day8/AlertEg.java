package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("admin");
		driver.findElement(By.id("login")).click();
		
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		
		alt.accept();
//		alt.dismiss();
//		alt.sendKeys("Yes");
	}

}
