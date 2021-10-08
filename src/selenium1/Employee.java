package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium1\\dri\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	int size = frames.size();
	System.out.println(size);
	WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src=\"https:/www.youtube.com/embed/RbSlW8jZFe8\"][1]"));
	driver.switchTo().frame(0);
	WebElement btnYouTube = driver.findElement(By.xpath("//button[@aria-label='Play']"));
	btnYouTube.click();
	driver.switchTo().defaultContent();
	WebElement txt = driver.findElement(By.xpath("//font[text()=['THIS IS A DEMO PAGE FOR TESTING']"));
	System.out.println(txt.getText());
	
		
	}

		
	}


