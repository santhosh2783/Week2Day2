package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class editlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Editlead");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santyZ");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Local");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Department1");
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Descriptionnnnnnnnnnnnn1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		//State province DD
		WebElement statprovDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select2 = new Select(statprovDD);
		select2.selectByVisibleText("Alabama");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).clear();
		driver.findElement(By.xpath("//textarea[contains(@name,'importantNote')]")).sendKeys("IMPONOTEEEE2");
		driver.findElement(By.className("smallSubmit")).click();
		String Titl = driver.getTitle();
        System.out.println(Titl);
        driver.close();

	}

}
