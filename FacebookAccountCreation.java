package Week2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Shahul Hameed");
		
		driver.findElement(By.name("lastname")).sendKeys("Basheer Ali");
		
		driver.findElement(By.name("reg_email__")).sendKeys("shahulhmd139@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Aznav@13");	
		
		WebElement dayDD = driver.findElement(By.id("day"));
		
		Select dropdown1=new Select(dayDD);
		
		dropdown1.selectByIndex(12);
		
		WebElement monthDD = driver.findElement(By.id("month"));
		
		Select dropdown2=new Select(monthDD);
		
		dropdown2.selectByValue("9");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		
		Select dropdown3=new Select(yearDD);
		
		dropdown3.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
	}

}
