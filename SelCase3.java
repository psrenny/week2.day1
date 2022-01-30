
package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelCase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sunny");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/01/1990");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5000000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Symbol");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium class");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Notes");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600011");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9232342343");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("seleniumTest@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://test,com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Renny");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:21 Dadji stree");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Anna Nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600011");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("Chennai");
		driver.findElement(By.name("submitButton")).click();
				
		
		

	}

}
