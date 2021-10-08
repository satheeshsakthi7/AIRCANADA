package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Client {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium1\\dri\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://en-gb.facebook.com");
	driver.manage().window().maximize();
	WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	btnCreate.click();
	Thread.sleep(3000);
	WebElement day = driver.findElement(By.id("day"));
	day.click();
	Thread.sleep(3000);
	Select s = new Select(day);
	s.selectByValue("6");
	WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
    Month.click();
	Select m =new Select(Month);
	m.selectByVisibleText("May");
	WebElement btnmale = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
btnmale.click();
WebElement txtname = driver.findElement(By.name("firstname"));
txtname.sendKeys("ytjtj");
Thread.sleep(3000);
WebElement txtusername = driver.findElement(By.name("lastname"));
txtusername.sendKeys("fdffd");
WebElement  txtpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
txtpassword.sendKeys("22525");
	}
	
	
}

