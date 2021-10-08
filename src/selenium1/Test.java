package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium1\\dri\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/s?k=mobiles&ref=nb_sb_noss_2");
	driver.manage().window().maximize();
 String ParentWindow = driver.getWindowHandle();
 Thread.sleep(3000);
 WebElement btnphone = driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M31')]"));
 btnphone.click();
 Set<String> allwindow = driver.getWindowHandles();
 for (String x: allwindow) {
	 if(x.equals(ParentWindow));{
		 driver.switchTo().window(x);
	 }
 }
 WebElement Price = driver.findElement(By.id("priceblock_ourprice"));
 System.out.println(Price.getText());
 driver.close();
 driver.switchTo().window(ParentWindow);
 
}
}