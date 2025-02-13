package Week2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		 driver.get("http://leaftaps.com/opentaps/control/main");
		
		 driver.manage().window().maximize();
		
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Create Lead")).click();
	
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shahul Hameed");
			
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Basheer ali");
		 
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		 
		
		
		

	}

}
