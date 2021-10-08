package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class STO {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\selenium1\\dri\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://output.Jsbin.com/osebed/2");
	WebElement ddfruits  = driver.findElement(By.id("fruits"));
	Select s = new Select(ddfruits);
	boolean Apple= s.isMultiple();
	System.out.println(Apple); 
	s.selectByIndex(0);
	WebElement first = s.getFirstSelectedOption();
	System.out.println(first.getText());
	//s.deselectByIndex(0);
	List<WebElement> alloptions = s.getOptions();
	for(WebElement x:alloptions) {
		String text = x.getAttribute("value");
		s.selectByValue(text);
	}
	
	
}

}
