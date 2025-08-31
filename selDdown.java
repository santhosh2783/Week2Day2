package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class selDdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa"); 
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("SANACCOUNT2A");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("SELENIUM AUTOMATION TESTER");
		//industry DD
		//driver.findElement(By.name("industryEnumId"));
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select select1 = new Select(industryDD);
		select1.selectByIndex(4);
		//ownership DD
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select select2 = new Select(ownershipDD);
		select2.selectByVisibleText("S-Corporation");
		//Source DD
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select select3 = new Select(sourceDD);
		select3.selectByValue("LEAD_EMPLOYEE");
		//Market Compaign DD
		WebElement marketCompDD = driver.findElement(By.id("marketingCampaignId"));
		Select select4 = new Select(marketCompDD);
		select4.selectByIndex(6);
		//State DD
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select select5 = new Select(stateDD);
		select5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String str1 = driver.findElement(By.xpath("//span[contains(text(),'SANACCOUNT' )]")).getText();
		//String str1 = driver.findElement(By.class("tabletext")(3).get
		System.out.println(str1);
		driver.close();
		

	}

}
