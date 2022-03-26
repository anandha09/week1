package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver Driver=new ChromeDriver();
		
		Driver.get("http://leaftaps.com/opentaps/control/login");
		
		Driver.manage().window().maximize();
		Driver.findElement(By.id("username")).sendKeys("DemoCSR");
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		Driver.findElement(By.className("decorativeSubmit")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		Driver.findElement(By.linkText("Leads")).click();
		Driver.findElement(By.linkText("Create Lead")).click();
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anandh");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anandha");
		Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		Driver.findElement(By.id("createLeadForm_description")).sendKeys("I am anandh from ECE dept learning selenium in Test leaf insitute");
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anandh@gmail.com");
		WebElement findElement = Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(findElement);
		dd.selectByVisibleText("New York");
		Driver.findElement(By.name("submitButton")).click();
		String title = Driver.getTitle();
		System.out.println(title);
		
		
		
	}
	
	}


