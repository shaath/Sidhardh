package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 407, 115).build().perform();

	}

}
