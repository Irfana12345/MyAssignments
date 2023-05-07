package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicatelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("XXX");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("CLASS");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working on it");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("irfi.annu@gmail.com");
	WebElement source=	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec= new Select(source);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.className("inputBox")).clear();
		driver.findElement(By.className("inputBox")).sendKeys("check");
	//	driver.findElement(By.name("companyName")).sendKeys("info");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("irfi");
	driver.findElement(By.name("submitButton")).click();
	String title= driver.getTitle();
	System.out.println(title);
	
		
		
		
		
	}

}
