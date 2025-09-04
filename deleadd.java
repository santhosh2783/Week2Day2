package Week2.day2;

import java.time.Duration;

//import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class deleadd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("7871351808");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		////button[contains(text(),'Find Leads')]//** //button[text()='Find Leads']
		//(//a[@class='linktext'])[4]
		//WebElement str1 = driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		Thread.sleep(2000);
		WebElement str1 = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		//WebElement str1 = driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		//WebElement str1 = driver.findElement(By.xpath("//a[text()='11866']"));
		String text = str1.getText();
		System.out.println(text);
		str1.click();
		//driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.partialLinkText("Delete")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name ='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String str2 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		String expmess = "No records to display";
		if(str2.equals(expmess))
		{
			System.out.println("Lead id record deleted sucessfully");
		}
	}

}
