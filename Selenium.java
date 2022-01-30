package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

		public static void main(String[] args) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElement(By.id("firstNameField")).sendKeys("Renny");
			driver.findElement(By.id("lastNameField")).sendKeys("Sunny");
			driver.findElement(By.className("smallSubmit")).click();
			}

}
