package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anandh");
		driver.findElement(By.id("lastNameField")).sendKeys("Akshay");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("ak");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("WWE");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Iam anandh i am from Madurai");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anandhakshay@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd=new Select(findElement);
		dd.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is important text");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	}

}
