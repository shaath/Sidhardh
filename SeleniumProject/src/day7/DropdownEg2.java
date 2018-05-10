package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=6c5190fdc204677eaefb89c8b831f6bf");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		Select s=new Select(drop);
		
		List<WebElement> list=s.getOptions();
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++)
		{
			s.selectByIndex(i);
			String city=list.get(i).getText();
			System.out.println(city);
		}
	}

}
