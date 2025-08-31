package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        driver.findElement(By.name("firstname")).sendKeys("FFFFNAME");
        driver.findElement(By.name("lastname")).sendKeys("LASTNAME");
        //Date Drop Down
        WebElement dateDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select1 = new Select(dateDD);
        select1.selectByValue("1");
        //Month Drop Down
        WebElement mDD = driver.findElement(By.xpath("//select[@id='month']"));
        Select select2 = new Select(mDD);
        select2.selectByValue("9");
        //YearDrop Down
        //Thread.sleep(1000);
        WebElement yearDD = driver.findElement(By.xpath("//select[@id='year']"));
        Select select3 = new Select(yearDD);
        select3.selectByValue("2000");
        WebElement radiobtn = driver.findElement(By.xpath("//input[@type='radio' and @value='2']")); 
        radiobtn.click();
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9988776655");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("NEWPWDD123");
        
	}

}
